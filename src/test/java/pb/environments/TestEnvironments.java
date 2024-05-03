package pb.environments;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class TestEnvironments {

    private final EnvironmentVariables environmentVariables;

    public TestEnvironments(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getBaseUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("rest.api.base.url");
    }

    public String getClientSecret() {
        return EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("client.secret.auth.token");
    }


    public String getClientId() {
        return EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("client.id.auth.token");
    }

    public String getBaseUrlToken() {
        return EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("base.url.token");
    }
}

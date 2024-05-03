package pb.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features",
        glue = {"classpath:pb.stepdefinitions"},
        //tags = "@Regresion",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {
}

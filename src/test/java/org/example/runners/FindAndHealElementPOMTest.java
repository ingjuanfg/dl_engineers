package org.example.runners;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.example.pom.steps.TestEnvSteps;

@ExtendWith(SerenityJUnit5Extension.class)
class FindAndHealElementPOMTest {

    @Managed
    WebDriver driver;

    @Steps
    TestEnvSteps testEnvSteps;

    @Test
    public void changeElementToHeal() {
        testEnvSteps.openPage();
        testEnvSteps.findElement();
        testEnvSteps.clickOnSubmit();
        testEnvSteps.findElement();
    }
}

package org.example.steps;


import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.page.HealeniumTestPage;

public class TestEnvSteps extends ScenarioSteps {

    private static final long serialVersionUID = 5416584546042922230L;

    public TestEnvSteps(Pages pages) {
        super(pages);
    }

    public HealeniumTestPage healeniumTestPage() {
        return getPages().currentPageAt(HealeniumTestPage.class);
    }

    @Step
    public void openPage() {
        Open.browserOn().the(HealeniumTestPage.class);
    }

    @Step
    public void findElement() {
        healeniumTestPage().isPresent();
    }

    @Step
    public void clickOnSubmit() {
        healeniumTestPage().clickSubmit();
    }

}

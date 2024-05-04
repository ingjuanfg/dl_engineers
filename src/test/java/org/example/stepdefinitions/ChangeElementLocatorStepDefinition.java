package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.ElementIsVisible;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.pages.InitialPage.BTN_SUBMIT;

public class ChangeElementLocatorStepDefinition {
    @Given("that {word} the user is on the page")
    public void queElUsuarioSeEncuentraEnLaPagina(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Open.url("https://elenastepuro.github.io/test_env/index.html")
        );
    }

    @When("he change the locator or element")
    public void elUsuarioIngreseSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_SUBMIT)
        );
    }

    @Then("the AI should recognize the change")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
        theActorInTheSpotlight().should(seeThat(ElementIsVisible.afterChanges()));
    }
}

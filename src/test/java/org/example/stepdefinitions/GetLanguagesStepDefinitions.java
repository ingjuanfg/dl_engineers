package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.example.tasks.GetLanguages;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetLanguagesStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that user want to know available languages")
    public void thatUserWantToKnowAvailableLanguages() {
        OnStage.theActorCalled("FELIPE").whoCan(CallAnApi.at("https://reqres.in/api"));
    }

    @When("he gets the languages using the API")
    public void heGetsTheLanguagesUsingTheAPI() {
        theActorInTheSpotlight()
                .attemptsTo(GetLanguages.on());
    }

    @Then("should get all the available languages")
    public void shouldGetAllTheAvailableLanguages() {
        theActorInTheSpotlight()
                .should(
                        seeThatResponse("El codigo de respuesta es 200",
                                response -> response.statusCode(200)));
    }
}

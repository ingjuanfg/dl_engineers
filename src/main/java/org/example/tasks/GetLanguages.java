package org.example.tasks;

import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.example.modelo.RsConsulta;
import org.example.util.JsonUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetLanguages implements Task {

    public static GetLanguages on() {
        return instrumented(GetLanguages.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/posts"));
        Response responseBody = OnStage.theActorInTheSpotlight().asksFor(LastResponse.received());
        actor.remember("RESPONSE_BODY",responseBody.body().asString());
        System.out.println(responseBody.body().
                asString());
        RsConsulta rsConsulta = (RsConsulta) JsonUtil.stringToObject(responseBody.body().asString(), RsConsulta.class);
        System.out.println(rsConsulta);
    }
}

package org.example.tasks;

import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.example.modelo.RsConsulta;
import org.example.modelo.data.RsData;
import org.example.util.JsonUtil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetLanguages implements Task {

    public static GetLanguages on() {
        return instrumented(GetLanguages.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/users"));
        Response responseBody = OnStage.theActorInTheSpotlight().asksFor(LastResponse.received());
        RsData rsConsulta = (RsData) JsonUtil.stringToObject(responseBody.body().asString(), RsData.class);
       // RsConsulta rsConsulta = (RsConsulta) JsonUtil.stringToObject(responseBody.body().asString(), RsConsulta.class);
        System.out.println(rsConsulta.getLabelTitlePage().get(0).getEnglish() + "hola");
        actor.remember("RESPONSE_BODY",rsConsulta);


    }
}

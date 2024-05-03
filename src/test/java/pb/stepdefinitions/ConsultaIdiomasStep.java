package pb.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.example.tasks.GetLanguages;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaIdiomasStep {


    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario quiere consumir el api de idiomas disponibles")
    public void prepararUsuario() {
        OnStage.theActorCalled("FELIPE").whoCan(CallAnApi.at("https://reqres.in/api"));
    }

    @Cuando("realiza la consulta de los idiomas en el servicio")
    public void consumirServicio() {
        theActorInTheSpotlight()
                .attemptsTo(GetLanguages.on());
    }

    @Entonces("se debe obtener todos los idiomas disponibles")
    public void validarReponse() {
        theActorInTheSpotlight()
                .should(
                        net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse("El codigo de respuesta es 200",
                                response -> response.statusCode(200)));

    }

}

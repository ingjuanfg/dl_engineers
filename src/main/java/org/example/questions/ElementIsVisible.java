package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.pages.InitialPage.BTN_CHANGE_ID_ELEMENT;

public class ElementIsVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_CHANGE_ID_ELEMENT.resolveFor(actor).isVisible();
    }

    public static ElementIsVisible afterChanges( ){
        return new ElementIsVisible();
    }

}
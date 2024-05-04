package org.example.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://elenastepuro.github.io/test_env/index.html")
public class InitialPage {
    public static final Target BTN_CHANGE_ID_ELEMENT = Target.the("Button to change element").locatedBy("//*[@id='change_id' and @type='text']");
    public static final Target BTN_SUBMIT = Target.the("Button to Submit").located(By.id("Submit"));

}

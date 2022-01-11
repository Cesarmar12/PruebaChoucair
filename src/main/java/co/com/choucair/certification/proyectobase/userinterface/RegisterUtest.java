package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtest extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Boton para registrarse").
            located(By.className("unauthenticated-nav-bar__sign-up"));


    public static final Target NAME_PRINCIPAL = Target.the("Muestra nombre principal").
            located(By.xpath("//h1[contains(text(),'The Largest Community of Testers in the World')]"));


}

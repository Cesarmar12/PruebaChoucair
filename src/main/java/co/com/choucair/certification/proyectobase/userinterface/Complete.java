package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete extends PageObject {

    public static final Target PASSWORD = Target.the("password").
            located(By.id("password"));

    public static final Target CONFIRM_PASSWORD =Target.the("confirm password").
            located(By.id("confirmPassword"));

    public static final Target CONDITION_ONE =Target.the("condition one").
            located(By.xpath("//span[@class=\"checkmark signup-consent__checkbox error\"]"));


    public static final Target CONDITION_TWO =Target.the("condition two").
            located(By.xpath("//span[@class=\"checkmark signup-consent__checkbox error\"]"));



    public static final  Target COMPLETE_BUTTON = Target.the("complete button").
            located(By.id("laddaBtn"));





}

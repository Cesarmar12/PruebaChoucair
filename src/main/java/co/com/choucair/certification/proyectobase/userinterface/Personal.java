package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal extends PageObject {

    public static final Target FIRSTNAME= Target.the("first name").
            located(By.id("firstName"));

    public static  final  Target LASTNAME= Target.the("last name").
            located(By.id("lastName"));

    public static final Target EMAIL= Target.the("email").
            located(By.id("email"));


    public static final Target MONTH= Target.the("month").
            located(By.id("birthMonth"));

    public static final Target DAY= Target.the("day").
            located(By.id("birthDay"));

    public static final Target YEAR= Target.the("year").
            located(By.id("birthYear"));




    public static  final  Target LOCATION_BUTTON= Target.the("location button").
            locatedBy("//a[@class=\"btn btn-blue\"]");



}

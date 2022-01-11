package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location extends PageObject {

    public static final Target CITY= Target.the("city").located(By.id("city"));





    public static final Target DEVICES_BUTTON= Target.the("devices button").
            located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));






}

package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices extends PageObject {

    public static final Target YOUR_COMPUTER= Target.the("your computer").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");

    public static final Target LINUX= Target.the("linux").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");




    public static final Target VERSION= Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");

    public static final Target UBUNTU= Target.the("ubuntu").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");



    public static final Target LANGUAGE= Target.the("language").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");

    public static final Target ARMENIAN= Target.the("armenian").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");



    public static final Target LASTSTEP_BUTTON = Target.the("last step button").
            located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));



    public static final Target YOUR_MOBILE= Target.the("your mobile").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");


    public static final Target ALCATEL= Target.the("alcatel").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");


    public static final Target MODEL= Target.the("model").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");


    public static final Target CRYSTAL= Target.the("crystal").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");


    public static final Target OPERATING_SYSTEM= Target.the("operating system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");


    public static final Target ANDROID= Target.the("android").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[1]");







}

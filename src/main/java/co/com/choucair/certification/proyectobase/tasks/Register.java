package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private String firtName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String password;
    private String confirmPassword;


    public Register(String firtName, String lastName, String email, String month, String day, String year, String password, String confirmPassword) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }



    public static Register onThePage(String firtName, String lastName, String email, String month, String day, String year, String password, String confirmPassword) {

        return Tasks.instrumented(Register.class,firtName,lastName,email,month,day,year,password,confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(RegisterUtest.REGISTER_BUTTON),
                Enter.theValue(firtName).into(Personal.FIRSTNAME),
                Enter.theValue(lastName).into(Personal.LASTNAME),
                Enter.theValue(email).into(Personal.EMAIL),
                Click.on(Personal.MONTH),
                Click.on("//option[@label='"+month+"']"),
                Click.on(Personal.DAY),
                Click.on("//option[@label='"+day+"']"),
                Click.on(Personal.YEAR),
                Click.on("//option[@label='"+year+"']"),
                Click.on(Personal.LOCATION_BUTTON),
                Click.on(Location.CITY),
                Click.on(Location.DEVICES_BUTTON),
                Click.on(Devices.YOUR_COMPUTER),
                Click.on(Devices.LINUX),
                Click.on(Devices.VERSION),
                Click.on(Devices.UBUNTU),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ARMENIAN),
                Click.on(Devices.YOUR_MOBILE),
                Click.on(Devices.ALCATEL),
                Click.on(Devices.MODEL),
                Click.on(Devices.CRYSTAL),
                Click.on(Devices.OPERATING_SYSTEM),
                Click.on(Devices.ANDROID),
                Click.on(Devices.LASTSTEP_BUTTON),
                Enter.theValue(password).into(Complete.PASSWORD),
                Enter.theValue(confirmPassword).into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.CONDITION_ONE),
                Click.on(Complete.CONDITION_TWO),
                Click.on(Complete.COMPLETE_BUTTON)


                );


    }
}

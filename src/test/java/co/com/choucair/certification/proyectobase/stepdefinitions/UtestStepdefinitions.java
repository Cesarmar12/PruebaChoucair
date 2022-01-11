package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.model.RegisterModel;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepdefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
    OnStage.theActorCalled("CESAR").wasAbleTo(OpenUp.thePage());
    }

    @When("^user creates an account by filling in all the form data$")
    public void userCreatesAnAutomatizacionAccountByFillingInAllTheFormData(List<RegisterModel>registerModel) throws Exception {

    OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(registerModel.get(0).getFirtName(),
            registerModel.get(0).getLastName(),registerModel.get(0).getEmail(),registerModel.get(0).getMonth(),
            registerModel.get(0).getDay(),registerModel.get(0).getYear(),registerModel.get(0).getPassword(),registerModel.get(0).getConfirmPassword()));

    }

    @Then("^User sees her username created (.*)$")
    public void userSeesHerUsernameCreatedActualizacion(String question) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));
    }


}

package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.RegisterUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private  String question;

    public Answer(String question) {
        this.question = question;
    }



    public static Answer tothe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String namePrincipal= Text.of(RegisterUtest.NAME_PRINCIPAL).viewedBy(actor).asString();
        if (question.equals(namePrincipal)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

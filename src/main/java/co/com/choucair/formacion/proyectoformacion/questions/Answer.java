package co.com.choucair.formacion.proyectoformacion.questions;

import co.com.choucair.formacion.proyectoformacion.userinterface.ChoucairCursoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer  toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado;
        String NombreCurso = Text.of(ChoucairCursoPage.NOMBRE_CURSO).viewedBy(actor).asString();
        if (question.equals(NombreCurso)) {
            resultado = false;
        }else {
            resultado = true;
        }
        return resultado;
    }
}

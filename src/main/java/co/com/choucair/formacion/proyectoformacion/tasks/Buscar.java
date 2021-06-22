package co.com.choucair.formacion.proyectoformacion.tasks;

import co.com.choucair.formacion.proyectoformacion.model.Curso;
import co.com.choucair.formacion.proyectoformacion.userinterface.ChoucairCursoPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Buscar implements Task {
    private List<Curso> Curso;

    public Buscar(List<Curso> Curso){
        this.Curso = Curso;
    }

    public static Buscar el(List<Curso> Curso) {
       return Tasks.instrumented(Buscar.class,Curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairCursoPage.UNI_BOTON),
                Enter.theValue(String.valueOf("Induccion Corporativa")).into(ChoucairCursoPage.NOMBRECURSO_BOTON),
                Click.on(ChoucairCursoPage.IR_BOTON)  );
    }
}

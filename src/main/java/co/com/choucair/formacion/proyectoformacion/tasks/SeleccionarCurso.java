package co.com.choucair.formacion.proyectoformacion.tasks;

import co.com.choucair.formacion.proyectoformacion.model.Curso;
import co.com.choucair.formacion.proyectoformacion.userinterface.ChoucairCursoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class SeleccionarCurso implements Task {

    public static SeleccionarCurso el(List<Curso> curso) {
        return Tasks.instrumented(SeleccionarCurso.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ChoucairCursoPage.AUTO_BOTON),
                Click.on(ChoucairCursoPage.AUTO_BOTON)
        );

    }
}

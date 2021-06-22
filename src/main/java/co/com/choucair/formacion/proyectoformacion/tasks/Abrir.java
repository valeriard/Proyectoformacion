package co.com.choucair.formacion.proyectoformacion.tasks;

import co.com.choucair.formacion.proyectoformacion.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private ChoucairAcademyPage choucairAcademyPage;

    public static Abrir ChoucairAcademy() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }
}

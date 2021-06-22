package co.com.choucair.formacion.proyectoformacion.tasks;


import co.com.choucair.formacion.proyectoformacion.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login enLapagina() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BOTON),
                Enter.theValue("vriverad").into(ChoucairLoginPage.NOMBRE_BOTON),
                Enter.theValue("Choucair2021*").into(ChoucairLoginPage.CONTRASE_BOTON),
                Click.on(ChoucairLoginPage.ACCEDER_BOTON));
    }
}

package co.com.choucair.formacion.proyectoformacion.stepdefinitions;

import co.com.choucair.formacion.proyectoformacion.model.Curso;
import co.com.choucair.formacion.proyectoformacion.questions.Answer;
import co.com.choucair.formacion.proyectoformacion.tasks.Abrir;
import co.com.choucair.formacion.proyectoformacion.tasks.Buscar;
import co.com.choucair.formacion.proyectoformacion.tasks.Login;
import co.com.choucair.formacion.proyectoformacion.tasks.SeleccionarCurso;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor valeria = Actor.named("Valeria");

    @Before
    public void cargaInicial(){
        valeria.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^: Valeria quiere aprender a automatizar en la academia choucair$")
    public void valeriaQuiereAprenderAAutomatizarEnLaAcademiaChoucair() {
       valeria.wasAbleTo(Abrir.ChoucairAcademy(),(Login.enLapagina()));
    }

    @When("^: ella busque el curso  en la plataforma de academia choucair$")
    public void ellaBusqueElCursoEnLaPlataformaDeAcademiaChoucair(List<Curso> Curso)  {
        valeria.wasAbleTo(Buscar.el(Curso), SeleccionarCurso.el(Curso));

    }

    @Then("^: ella entra al curso Automatizacion de pruebas(.*)$")
    public void ellaEntraAlCursoAutomatizacionDePruebas(String question) {
        valeria.should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}


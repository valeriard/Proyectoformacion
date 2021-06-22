package co.com.choucair.formacion.proyectoformacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairCursoPage extends PageObject {
    public static final Target UNI_BOTON = Target.the("Boton de Universidad Choucair, para Buscar el curso")
            .located(By.xpath("(//IMG[@class='card-img-top'])[1]/../..//STRONG"));
    public static final Target NOMBRECURSO_BOTON = Target.the("Campo de buscar cursos, para Buscar el curso de Automatizacion")
            .located(By.xpath("//*[@id='coursesearchbox']"));
    public static final Target IR_BOTON = Target.the("Boton de Ir, para Buscar el curso")
            .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));

    public static final Target AUTO_BOTON = Target.the("Boton de Automatizacion, para Entrar el curso")
            .located(By.xpath("//*[@class='result']/h4/a"));

    public static final Target NOMBRE_CURSO = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//H3[text()='Estrategia']"));
}

package co.com.choucair.formacion.proyectoformacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BOTON = Target.the("Boton de Login, para loggearse")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));
    public static final Target NOMBRE_BOTON = Target.the("campo de nombre")
            .located(By.xpath("//*[@id='username']"));
    public static final Target CONTRASE_BOTON = Target.the("ingresar contraseña")
            .located(By.xpath("//*[@id='password']"));
    public static final Target ACCEDER_BOTON = Target.the("Boton Acceder,para ingresar como usuario")
            .located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]"));
}

package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class GoogleHome extends PageObject{
	
	public static Target txtBusqueda = Target.the("Caja de texto de busqueda").located(By.name("q"));
	public static Target btnBuscar = Target.the("Boton Buscar").locatedBy("/html[1]/body[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]");
	
}

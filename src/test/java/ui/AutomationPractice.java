package ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://automationpractice.com/index.php")

public class AutomationPractice extends PageObject{
	
	public static Target txt_Busqueda  = Target.the("Caja de Búsqueda").locatedBy("//input[@id='search_query_top']");
	public static Target btn_Buscar = Target.the("Boton 'Buscar'").locatedBy("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]");
	public static Target btn_colorNegro = Target.the("Dress Negro").locatedBy("//a[@id='color_22']");
	
	//MENU WOMEN
	public static Target mnu_Women = Target.the("El menú 'Women'").locatedBy("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
	public static Target btn_Tops = Target.the("Boton 'Tops'").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[1]/a[1]/img[1]");
	public static Target btn_colorAzul = Target.the("Top Azul").locatedBy("//a[@id='color_2']");
		
	//MENU DRESSES
	public static Target  mnu_Dresses = Target.the("El menú 'Dresses'").locatedBy("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	public static Target lst_SortBy = Target.the("Desplegable de orden").locatedBy("selectProductSort");
	
	//MENU TSHIRTS
	public static Target mnu_TShirts = Target.the("El menú 'T-Shirts' ").locatedBy("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
}

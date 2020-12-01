package feactures;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import task.DisponibleAutoPractice;
import task.OpenTheApplication;
import task.Search;
import task.SearchAutoPractice;
import task.SelectAutoPractice;
import ui.AutomationPractice;
import ui.GoogleHome;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");
    Actor juan = Actor.named("Juan");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
        juan.can(BrowseTheWeb.with(herBrowser));
    }
     /*@Test
    public void search_results_should_show_the_search_term_in_the_title() {
        givenThat(anna).wasAbleTo(openTheApplication);

        when(anna).attemptsTo(Search.forTheTerm("BDD In Action"));

        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

    }
    @Test
    public void searchGoogle() {
    	GoogleHome googleHome = new GoogleHome();
    	
    	givenThat(anna).attemptsTo(Open.browserOn().the(googleHome));
    	
    	//WHEN = CUANDO, Intenta ingresar el valor en el elemento txtBusqueda y presiona ENTER
    	when(anna).attemptsTo(Enter.theValue("Algoritmo").into(googleHome.txtBusqueda).thenHit(Keys.ENTER));
    }*/
    @Test
    public void Search_PrintedSummerDress(){
    	//AutomationPractice home = new AutomationPractice();
    	//givenThat(anna).attemptsTo(Open.browserOn().the(home));
    	//when(anna).attemptsTo(Enter.keyValues("Dress").into(home.txt_Busqueda).thenHit(Keys.ENTER),Click.on(home.btn_colorNegro));
    	
    	when(anna).attemptsTo(SearchAutoPractice.forTheText("Dress"));
    	then(anna).should(eventually(seeThat(TheWebPage.title(),containsString("Printed Summer Dress"))));
    }
    @Test
    public void RemeraAzul_Disponible() {
    	AutomationPractice home = new AutomationPractice();
    	when(juan).attemptsTo(DisponibleAutoPractice.select());
    	then(juan).should(eventually(seeThat(the(home.btn_colorAzul),isPresent()))); 
    }
    @Test
    public void Ordenar_Listado() {
    	when(anna).attemptsTo(SelectAutoPractice.forTheVisibleText("Price: Lowest first"));
    }
}
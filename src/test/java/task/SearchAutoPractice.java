package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import ui.AutomationPractice;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SearchAutoPractice implements Task {
	
	public static AutomationPractice home;
	private String searchText = "";
	
	public SearchAutoPractice(String searchText) {
		this.searchText = searchText;
	}
	
	@Override
	@Step("{0} busca: #searchText ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(home),
				Enter.keyValues(searchText).into(home.txt_Busqueda).thenHit(ENTER),
				Click.on(home.btn_colorNegro));
	}
	public static SearchAutoPractice forTheText(String searchText) {
		return instrumented(SearchAutoPractice.class, searchText);
	}
}

package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import ui.AutomationPractice;

public class SelectAutoPractice implements Task{
	
	public static AutomationPractice home;
	private String itemText = "";
	
	public SelectAutoPractice(String itemText) {
		this.itemText = itemText;
	}
	
	@Override
	@Step("{0} Selecciona del desplegable: #itemText")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(home),
				Click.on(home.mnu_Dresses),
		 		SelectFromOptions.byVisibleText(itemText).from(home.lst_SortBy));
	}
	
	public static SelectAutoPractice forTheVisibleText(String itemText) {
		return instrumented(SelectAutoPractice.class, itemText);
	}

}

package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import ui.AutomationPractice;

public class DisponibleAutoPractice implements Task{
	
	public static AutomationPractice home;
	
	@Override
	@Step("{0} verifica disponibilidad de la remera azul")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(home),
				Click.on(home.mnu_Women), 
				Click.on(home.btn_Tops));	
	}
	public static DisponibleAutoPractice select() {
		return instrumented(DisponibleAutoPractice.class);
	}
}

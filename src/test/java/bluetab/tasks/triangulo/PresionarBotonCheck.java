package bluetab.tasks.triangulo;

import bluetab.userinterfaces.trianguloPage.TrianguloPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PresionarBotonCheck implements Task {

    public static PresionarBotonCheck PresionarBotonCheck() {
        return new PresionarBotonCheck();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Serenity.takeScreenshot();
        actor.attemptsTo(

                Click.on(TrianguloPage.CHECK_BUTTON)
        );
        Serenity.takeScreenshot();
    }
}

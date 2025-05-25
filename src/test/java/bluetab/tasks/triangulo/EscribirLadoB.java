package bluetab.tasks.triangulo;

import bluetab.userinterfaces.trianguloPage.TrianguloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class EscribirLadoB implements Task {

    private final String ladoB;

    public EscribirLadoB(String ladoB) {
        this.ladoB = ladoB;
    }
    public static EscribirLadoB EscribirLadoB(String ladoB) {
        return Tasks.instrumented(EscribirLadoB.class, ladoB);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ladoB).into(TrianguloPage.SIDE_B)
        );
    }
}

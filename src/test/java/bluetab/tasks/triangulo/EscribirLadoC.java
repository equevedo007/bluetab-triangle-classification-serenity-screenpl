package bluetab.tasks.triangulo;

import bluetab.userinterfaces.trianguloPage.TrianguloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribirLadoC implements Task {

    private final String ladoC;

    public EscribirLadoC(String ladoC) {
        this.ladoC = ladoC;
    }

    public static EscribirLadoC EscribirLadoC(String ladoC) {
        return Tasks.instrumented(EscribirLadoC.class, ladoC);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(ladoC).into(TrianguloPage.SIDE_C)
        );

    }
}

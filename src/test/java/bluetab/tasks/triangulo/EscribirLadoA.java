package bluetab.tasks.triangulo;

import bluetab.userinterfaces.trianguloPage.TrianguloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribirLadoA implements Task {

    private final String ladoA;

    public EscribirLadoA(String ladoA) {
        this.ladoA = ladoA;
    }
    public static EscribirLadoA EscribirLadoA(String ladoA) {
        return Tasks.instrumented(EscribirLadoA.class, ladoA);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(ladoA).into(TrianguloPage.SIDE_A)
        );

    }
}

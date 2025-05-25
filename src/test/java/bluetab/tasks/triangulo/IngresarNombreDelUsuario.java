package bluetab.tasks.triangulo;

import bluetab.userinterfaces.trianguloPage.TrianguloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarNombreDelUsuario implements Task {

    private final String nombreUsuario;

    public IngresarNombreDelUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public static IngresarNombreDelUsuario IngresarNombreDelUsuario(String nombreUsuario) {
        return Tasks.instrumented(IngresarNombreDelUsuario.class, nombreUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(TrianguloPage.INPUT_NAME)
        );


    }
}

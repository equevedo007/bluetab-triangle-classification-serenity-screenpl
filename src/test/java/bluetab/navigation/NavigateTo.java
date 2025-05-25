package bluetab.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable triangulo() {
        return Task.where("{0} abre la pagina principal de Triangulo",
                Open.browserOn().the(BluetabTriangle.class));
    }
}

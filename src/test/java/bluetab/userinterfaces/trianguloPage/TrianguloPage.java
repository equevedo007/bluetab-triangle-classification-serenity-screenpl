package bluetab.userinterfaces.trianguloPage;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TrianguloPage {

    public static final Target INPUT_NAME = Target.the("campo de nombre")
            .located(By.id("username"));

    public static final Target SIDE_A = Target.the("Lado A")
            .located(By.id("SideA"));

    public static final Target SIDE_B = Target.the("Lado B")
            .located(By.id("SideB"));

    public static final Target SIDE_C = Target.the("Lado C")
            .located(By.id("SideC"));

    public static final Target CHECK_BUTTON = Target.the("Botón Check")
            .locatedBy("//button[@type='button' and text()='Check']");

    public static final Target RESULT_TEXT = Target.the("Mensaje de Resultado")
            .located(By.id("name"));



}

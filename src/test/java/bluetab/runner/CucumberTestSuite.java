package bluetab.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Runner principal para ejecutar los escenarios etiquetados con @Triangulo.
 * Utiliza Serenity BDD con Cucumber para generar reportes detallados.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "bluetab.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-report.json"},
        tags = "@Triangulo"
)
public class CucumberTestSuite {
}

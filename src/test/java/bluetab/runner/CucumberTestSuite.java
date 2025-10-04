package bluetab.runner;

import bluetab.utils.ReporteCucumber;
import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


/**
 * Runner principal para ejecutar los escenarios etiquetados con @Triangulo.
 * Utiliza Serenity BDD con Cucumber para generar reportes detallados.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "bluetab.stepdefinitions",
        plugin = {"pretty",
                "json:target/cucumber-report.json",
                "json:target/cucumber-report/cucumber.json"},
        tags = "@Triangulo"
)
public class CucumberTestSuite {

    @AfterClass
    public static void generarReporteCucumber() {
        ReporteCucumber reporte = new ReporteCucumber();
        reporte.cucumberReport("target/cucumber-report");

    }

}
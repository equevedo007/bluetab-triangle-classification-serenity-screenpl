package bluetab.stepdefinitions;

import bluetab.navigation.NavigateTo;
import bluetab.questions.ElResultadoEsperadoDelTriangulo;
import bluetab.tasks.triangulo.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class ClasificacionTriangulosSteps {

    private Actor actor;

    private int LadoA;
    private int LadoB;
    private int LadoC;



    @Before
    public void configurarElEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el {string} se dirige a la aplicacian de prueba de triangulos")
    public void el_se_dirige_a_la_aplicacian_de_prueba_de_triangulos(String nombreActor) {
        OnStage.theActorCalled(nombreActor).attemptsTo(NavigateTo.triangulo());
    }

    @When("el usuario ingresa su nombre {string}")
    public void el_usuario_ingresa_su_nombre(String nombre) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarNombreDelUsuario.IngresarNombreDelUsuario(nombre)
        );
    }

    @When("escribe {string} en el campo Side A")
    public void escribe_en_el_campo_side_a(String SideA) {
        this.LadoA = Integer.parseInt(SideA);
        OnStage.theActorInTheSpotlight().attemptsTo(
                EscribirLadoA.EscribirLadoA(SideA)
        );
    }

    @When("escribe {string} en el campo Side B")
    public void escribe_en_el_campo_side_b(String SideB) {
        this.LadoB = Integer.parseInt(SideB);
        OnStage.theActorInTheSpotlight().attemptsTo(
                EscribirLadoB.EscribirLadoB(SideB)
        );
    }
    @When("escribe {string} en el campo Side C")
    public void escribe_en_el_campo_side_c(String SideC) {
        this.LadoC = Integer.parseInt(SideC);
        OnStage.theActorInTheSpotlight().attemptsTo(
                EscribirLadoC.EscribirLadoC(SideC)
        );
    }
    @When("presiona el botón Check")
    public void presiona_el_botón_check() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                PresionarBotonCheck.PresionarBotonCheck()
        );

    }

    @Then("debería ver el mensaje {string}")
    public void debería_ver_el_mensaje(String resultadoEsperado) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ElResultadoEsperadoDelTriangulo.conLados(LadoA, LadoB, LadoC))
                        .isEqualTo(resultadoEsperado.toLowerCase())
        );

    }

    @Then("el sistema deberia dibujar un triangulo dentro del area canvas")
    public void el_sistema_deberia_dibujar_un_triangulo_dentro_del_area_canvas() {
        System.out.println("Casu de Prueba Manual");
    }


}

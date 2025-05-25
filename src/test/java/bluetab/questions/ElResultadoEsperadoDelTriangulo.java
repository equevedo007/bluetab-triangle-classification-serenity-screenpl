package bluetab.questions;

import bluetab.utils.ValidarTriangulos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElResultadoEsperadoDelTriangulo implements Question<String> {

    private final int ladoA;
    private final int ladoB;
    private final int ladoC;

    public ElResultadoEsperadoDelTriangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public static ElResultadoEsperadoDelTriangulo conLados(int a, int b, int c) {
        return new ElResultadoEsperadoDelTriangulo(a, b, c);
    }


    @Override
    public String answeredBy(Actor actor) {
        return ValidarTriangulos.ClasificarTriangulo(ladoA, ladoB, ladoC).toLowerCase().trim();
    }
}

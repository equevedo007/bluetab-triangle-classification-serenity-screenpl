package bluetab.pruebas;


import bluetab.utils.ValidarTriangulos;

public class Test {

    @org.junit.jupiter.api.Test
    public void ValidarTriangulo() {


        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(5, 5, 5));
        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(4, 4, 6));
        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(3, 4, 5));
        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(1, 2, 10));
        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(-1, 3, 3));
        System.out.println("El resultado del Triangulo es : " + ValidarTriangulos.ClasificarTriangulo(0, 4, 5));


    }

}

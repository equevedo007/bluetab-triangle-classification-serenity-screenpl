package bluetab.utils;

public class ValidarTriangulos {

    public static String ClasificarTriangulo(int a, int b, int c) {
        // Validación: ningún lado debe ser cero o negativo
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Todos los lados deben ser positivos";
        }

        // Verificación de la desigualdad triangular
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "No cumple la regla de la desigualdad triangular";
        }

        // Clasificación
        if (a == b && b == c) {
            return "Equilatero";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}

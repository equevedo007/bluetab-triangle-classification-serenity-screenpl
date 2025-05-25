Feature: Clasificación y validación de triángulos

  Como usuario que desea verificar el tipo de triángulo según sus lados
  Quiero ingresar tres longitudes para determinar si forman un triángulo válido
  Y, en caso afirmativo, conocer correctamente su clasificación


  @Triangulo
  Scenario Outline: Clasificación de triangulo valido
    Given el "<usuario>" se dirige a la aplicacian de prueba de triangulos
    When el usuario ingresa su nombre "<nombre>"
    And escribe "<ladoA>" en el campo Side A
    And escribe "<ladoB>" en el campo Side B
    And escribe "<ladoC>" en el campo Side C
    And presiona el botón Check
    Then debería ver el mensaje "<resultado>"

    Examples:
      | usuario | nombre  | ladoA | ladoB | ladoC | resultado  |
      | Edinson | Ismael  | 3     | 3     | 3     | Equilatero |
      | Edinson | Shirley | 4     | 4     | 6     | Isosceles  |
      | Edinson | Martha  | 4     | 6     | 4     | Isosceles  |
      | Edinson | Jorge   | 6     | 4     | 4     | Isosceles  |
      | Edinson | Roger   | 5     | 6     | 7     | Escaleno   |
      | Edinson | Diana   | 6     | 5     | 7     | Escaleno   |
      | Edinson | Hugo    | 7     | 6     | 5     | Escaleno   |



  @Triangulo
  Scenario Outline: Validación de triángulos no válidos
    Given el "<usuario>" se dirige a la aplicacian de prueba de triangulos
    When el usuario ingresa su nombre "<nombre>"
    And escribe "<ladoA>" en el campo Side A
    And escribe "<ladoB>" en el campo Side B
    And escribe "<ladoC>" en el campo Side C
    And presiona el botón Check
    Then debería ver el mensaje "<resultado>"

    Examples:
      | usuario | nombre  | ladoA | ladoB | ladoC | resultado                                       |
      | Edinson | Letty   | -1    | 3     | 3     | Todos los lados deben ser positivos             |
      | Edinson | Carmen  | 1     | -3    | 3     | Todos los lados deben ser positivos             |
      | Edinson | Nancy   | 1     | 3     | -3    | Todos los lados deben ser positivos             |
      | Edinson | Cesar   | 0     | 0     | 0     | Todos los lados deben ser positivos             |
      | Edinson | Augusto | 0     | 4     | 5     | Todos los lados deben ser positivos             |
      | Edinson | Jareth  | 5     | 0     | 5     | Todos los lados deben ser positivos             |
      | Edinson | Junior  | 3     | 4     | 0     | Todos los lados deben ser positivos             |
      | Edinson | Juan    | 2     | 2     | 5     | No cumple la regla de la desigualdad triangular |
      | Edinson | Miguel  | 10    | 2     | 1     | No cumple la regla de la desigualdad triangular |
      | Edinson | John    | 1     | 100   | 2     | No cumple la regla de la desigualdad triangular |
      | Edinson | Carlos  | 4     | 9     | 20    | No cumple la regla de la desigualdad triangular |


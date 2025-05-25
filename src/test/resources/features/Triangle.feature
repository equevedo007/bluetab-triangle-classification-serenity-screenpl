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

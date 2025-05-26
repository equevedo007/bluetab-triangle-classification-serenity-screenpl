# bluetab-triangle-screenplay-automation

Automatización de pruebas funcionales para la aplicación de clasificación y validación de triángulos, desarrollada como parte del **Reto Técnico de Automatización QA - Bluetab**.  
Este proyecto utiliza el patrón **Serenity BDD + Screenplay**, con soporte para integración continua a través de **Jenkins** y generación de reportes automáticos.

---

#  Objetivo

Verificar que la lógica de negocio de la aplicación clasifique correctamente un triángulo a partir de sus lados y valide restricciones geométricas, asegurando la calidad funcional del sistema bajo prueba.

---

## ️ Tecnologías utilizadas

- **Java 17**
- **Maven 3.9.9**
- **Serenity BDD**
- **Screenplay Pattern**
- **Cucumber (Gherkin)**
- **JUnit Platform**
- **Jenkins**
- **Chrome WebDriver (Headless Mode)**



## Estructura del proyecto



├── src
│   ├── main
│   │   └── java
│   │       └── bluetab
│   │           └── utils
│   │               └── ValidarTriangulos.java           # Lógica de clasificación de triángulos
│
│   └── test
│       ├── java
│       │   └── bluetab
│       │       ├── navigation
│       │       │   └── BluetabTriangle
│       │       │       └── NavigateTo.java              # Navegación a la URL de prueba
│       │       ├── pruebas
│       │       │   └── Test.java                        # Clase ejecutora alternativa de pruebas
│       │       ├── questions
│       │       │   └── ElResultadoEsperadoDelTriangulo.java  # Validación de resultados esperados
│       │       ├── runner
│       │       │   └── CucumberTestSuite.java           # Configuración de ejecución con tags
│       │       ├── stepdefinitions
│       │       │   ├── ClasificacionTriangulosSteps.java
│       │       │   └── ParameterDefinitions.java        # Glue code para Gherkin
│       │       ├── tasks.triangulo
│       │       │   ├── EscribirLadoA.java
│       │       │   ├── EscribirLadoB.java
│       │       │   ├── EscribirLadoC.java
│       │       │   ├── IngresarNombreDelUsuario.java
│       │       │   └── PresionarBotonCheck.java         # Acciones del actor (Screenplay)
│       │       └── userinterfaces.trianguloPage
│       │           └── TrianguloPage.java               # Mapeo de elementos UI
│
│       └── resources
│           └── features
│               └── Triangle.feature                     # Escenarios de prueba BDD
│           └── junit-platform.properties
│           └── serenity.conf
│           └── logback-test.xml
│
├── Jenkinsfile                                          # Definición del pipeline CI/CD
├── pom.xml                                              # Configuración y dependencias Maven
├── serenity.properties                                  # Parámetros globales para Serenity
├── README.md                                            # Documentación y guía de ejecución
└── .gitignore



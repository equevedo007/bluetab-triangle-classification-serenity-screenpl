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

src/
├── main/
│   └── java/
│       └── bluetab/
│           └── utils/
│               └── ValidarTriangulos.java
├── test/
│   └── java/
│       └── bluetab/
│           ├── navigation/
│           │   └── NavigateTo.java
│           ├── pruebas/
│           │   └── Test.java
│           ├── questions/
│           │   └── ElResultadoEsperadoDelTriangulo.java
│           ├── runner/
│           │   └── CucumberTestSuite.java
│           ├── stepdefinitions/
│           │   ├── ClasificacionTriangulosSteps.java
│           │   └── ParameterDefinitions.java
│           ├── tasks.triangulo/
│           │   ├── EscribirLadoA.java
│           │   ├── EscribirLadoB.java
│           │   ├── EscribirLadoC.java
│           │   ├── IngresarNombreDelUsuario.java
│           │   └── PresionarBotonCheck.java
│           └── userinterfaces.trianguloPage/
│               └── TrianguloPage.java
├── resources/
│   ├── features/
│   │   └── Triangle.feature
│   ├── junit-platform.properties
│   ├── serenity.conf
│   └── logback-test.xml
Jenkinsfile
pom.xml
serenity.properties
README.md
.gitignore



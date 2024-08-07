# Selenium (Selenide)

La siguiente plantilla está realizada con Selenide, Java, POM y allure.

**Nota**; Selenide es un marco de automatización de pruebas para aplicaciones web basado en Selenium WebDriver. Está diseñado para simplificar y mejorar la experiencia de escribir y mantener pruebas automatizadas. Ofrece una API más simple y fácil de usar que Selenium, con características destacadas:

- **Esperas automáticas**: Maneja automáticamente las esperas para la aparición o desaparición de elementos
en la página, reduciendo la necesidad de escribir explícitamente comandos de espera.

- **API concisa**: Proporciona una sintaxis más corta y legible, facilitando la escritura y mantenimiento 
de pruebas.

- **Soporte para múltiples navegadores**: Compatible con Chrome, Firefox, Edge, y otros navegadores 
mediante Selenium WebDriver.

- **Integración con frameworks de prueba**: Funciona bien con frameworks como JUnit, TestNG, y Cucumber, 
permitiendo una fácil integración en el flujo de trabajo de pruebas.

- **Capturas de pantalla automáticas**: Toma capturas de pantalla automáticamente en caso de fallos, lo 
que ayuda en la depuración de problemas.

**Documentacion**:  https://selenide.org/documentation.html
## Estructura del Proyecto

```bash
├── .idea
├── .mvn
├── build
├── src
│   └── test
│       └── java
│           ├── config
│           │   ├── Dev.java
│           │   ├── Prod.java
│           │   └── Stg.java
│           ├── pages
│           │   └── GooglePage.java
│           └── stepDefinition
│               └── BuscarStep.java
├── target
├── .gitignore
├── browsers.json
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
## Pre-requisitos
- Java Development Kit (JDK): [Java Development Kit (JDK)](https://docs.oracle.com/javase/8/docs/)
- Apache Maven: [Apache Maven](https://maven.apache.org/guides/index.html)
- Selenide: [Selenide](https://selenide.org/documentation.html)
- Allure Framework: [Allure Framework](https://docs.qameta.io/allure/)
- WebDriver: [WebDriver](https://www.selenium.dev/documentation/en/webdriver/)
- IDE (Entorno de Desarrollo Integrado): [IDE (Entorno de Desarrollo Integrado)](https://www.jetbrains.com/idea/documentation/)

## Comandos de Ejecución

Para ejecutar las pruebas y generar los reportes, utiliza los siguientes comandos en la consola:

- Ejecutar las Pruebas
```bash
mvn clean test
```

- Generar Reporte de Allure
```bash
mvn allure:report
```

- Servir el Reporte de Allure
```bash
mvn allure:serve
```

- Abrir reporte de allure
```bash
allure open
```
#  📫 Contacto
Para más información o consultas, puedes contactarme a través de mi correo electrónico: [osoriocruzjairo@gmail.com](mailto:osoriocruzjairo@gmail.com) o LinkedIn: [Jairo Osorio Cruz](https://www.linkedin.com/in/jairo-osorio-c-8461061b3/).

[![Email](https://img.shields.io/badge/-Email-D14836?style=flat&logo=gmail&logoColor=white)](mailto:osoriocruzjairo@gmail.com)
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jairo-osorio-c-8461061b3/)

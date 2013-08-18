Ejemplo de cucumber con gradle
===============

###¿cómo correr desde consola?
1. Instalar gradle de acuerdo a las intrucciones de http://www.gradle.org/docs/current/userguide/installation.html
2. Ejecutar gradle :cucumber

###¿cómo correr desde eclipse?
1. Instalar el gradle plugin for eclipse de https://github.com/SpringSource/eclipse-integration-gradle/blob/master/README.md
2. Importar como proyecto gradle
3. En run configuration se debe adicionar el system property que indica la ubicación del chrome driver ej: -Dwebdriver.chrome.driver=/Users/carlos/Downloads/chromedriver
4. Correr el test CucumberTest como junit4



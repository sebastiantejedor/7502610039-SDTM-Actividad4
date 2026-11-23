# Sistema de Investigación Científica

Aplicación desarrollada en Java que representa la gestión de los procesos de investigación de una universidad. El proyecto incluye un modelo de clases elaborado en UML con PlantUML y su correspondiente implementación utilizando programación orientada a objetos.

## Descripción del ejercicio

El sistema permite representar y gestionar diferentes elementos relacionados con la investigación universitaria, como investigadores, grupos de investigación, líneas de investigación, proyectos, publicaciones científicas e instituciones colaboradoras.

Su desarrollo parte de un modelo de clases UML, en el que se identifican las entidades principales, sus atributos, métodos y relaciones. Posteriormente, este modelo se implementa en Java mediante clases, objetos, interfaces y asociaciones.

Entre las situaciones que representa el sistema se encuentran:

- Un investigador puede pertenecer a varios grupos de investigación y cada grupo puede tener varios investigadores. En cada participación se registra el rol, la fecha de ingreso y el estado.
- Los proyectos pueden contar con la participación de varios investigadores, indicando el rol que desempeñan y su porcentaje de dedicación.
- Los proyectos pueden estar relacionados con diferentes instituciones colaboradoras.
- Las publicaciones científicas pueden tener varios autores, registrando el orden de autoría y el tipo de contribución de cada uno.
- Un investigador puede dirigir a otros investigadores durante el desarrollo de trabajos de formación.
- Las líneas de investigación pueden organizarse en líneas principales y sublíneas.

## Funcionalidades implementadas

Actualmente, el programa permite:

- Crear y registrar investigadores en una universidad.
- Consultar investigadores mediante su identificador.
- Actualizar la especialidad de los investigadores.
- Crear grupos de investigación y representar la participación de sus integrantes.
- Crear líneas de investigación y agregar sublíneas.
- Registrar proyectos de investigación.
- Relacionar proyectos con instituciones colaboradoras.
- Representar la participación de investigadores en proyectos.
- Validar los porcentajes de dedicación.
- Registrar publicaciones científicas.
- Asociar investigadores como autores de publicaciones.
- Representar trabajos y direcciones de formación.
- Evitar el registro de proyectos con identificadores duplicados.
- Eliminar investigadores registrados.
- Consultar y mostrar información desde la aplicación de consola.

## Tecnologías utilizadas

- **Java:** lenguaje utilizado para desarrollar la aplicación.
- **JDK 11 o superior:** entorno necesario para compilar y ejecutar el proyecto.
- **PlantUML:** herramienta utilizada para elaborar el diagrama de clases UML.
- **IntelliJ IDEA:** entorno de desarrollo utilizado para la implementación.
- **Git:** herramienta para el control de versiones.
- **GitHub:** plataforma utilizada para alojar el repositorio y registrar los avances del proyecto.

## Estructura del proyecto

El código fuente está organizado en cuatro paquetes principales para mantener separadas las responsabilidades de cada componente.

### Descripción de los paquetes

- **Modelo:** contiene las clases que representan las entidades principales del sistema y sus características.
- **Asociaciones:** contiene las clases que representan relaciones entre entidades y almacenan información propia de esas relaciones.
- **Servicios:** contiene la interfaz `IGestionInvestigacion` y la clase `ServicioInvestigacion`, encargadas de definir e implementar operaciones de gestión.
- **app:** contiene la clase `Main`, desde donde se inicia y ejecuta el programa.
- **docs:** contiene el diagrama de clases en formato de imagen y su archivo fuente de PlantUML.

## Diagrama de clases UML

El diseño del sistema se realizó mediante un diagrama de clases UML, utilizando PlantUML.

En este diagrama se representan las clases, sus atributos, métodos, relaciones, multiplicidades y asociaciones. También se muestra la implementación de la interfaz de gestión de investigación.

Los archivos del diagrama se encuentran en la carpeta `docs`:

- `diagrama-uml.png`: versión visual del diagrama.
- `diagrama-uml.puml`: código fuente utilizado para generar el diagrama.

## Instrucciones para ejecutar el proyecto

### Requisitos previos

Antes de ejecutar la aplicación, es necesario tener instalado:

1. Java Development Kit (JDK 11 o superior).
2. IntelliJ IDEA o un entorno de desarrollo compatible con Java.

### Ejecución desde IntelliJ IDEA

1. Descargar o clonar el repositorio del proyecto.
2. Abrir IntelliJ IDEA.
3. Seleccionar **Open** y elegir la carpeta del proyecto.
4. Esperar a que IntelliJ reconozca la estructura y configure el proyecto.
5. Verificar que el JDK esté correctamente configurado.
6. Abrir la carpeta `src` y entrar al paquete `app`.
7. Abrir el archivo `Main.java`.
8. Ejecutar el método `main` utilizando el botón de ejecución de IntelliJ.

Al iniciar el programa, se mostrarán en la consola los diferentes procesos de registro, asociación, consulta, validación y eliminación de información.

## Pruebas de ejecución

La clase `Main` contiene diferentes ejemplos que permiten comprobar el funcionamiento de las clases y sus relaciones.

Durante la ejecución se realizan registros de investigadores, proyectos y publicaciones; se crean asociaciones entre entidades; se consultan datos; se valida la dedicación de los investigadores y se comprueba el comportamiento del sistema ante registros duplicados.

Finalmente, se realiza la eliminación de un investigador y se muestra un resumen de los datos registrados.

## Autor

**Sebastian David Tejedor Montiel**

Facultad de Ingeniería  
Universidad de Cartagena

---

# Literalura

Literalura es un pequeño programa de consola desarrollado en Java que permite almacenar datos de  libros utilizando la API de Gutendex.


## Introducción

Literalura utiliza la API de Gutendex que gestiona datos de libros y los almacena en una base de datos. Su objetivo es proporcionar una manera rápida y fácil de gestionar un catálogo de libros desde la línea de comandos.

## Requisitos

Para ejecutar el programa, necesitas:

- Java 11 o superior
- Maven instalado para la gestión de dependencias
- Una base de datos SQL configurada

## Instalación

Sigue estos pasos para instalar y ejecutar el proyecto:

```bash
# Clonar el repositorio
$ git clone https://github.com/usuario/literalura.git

# Entrar al directorio del proyecto
$ cd literalura

# Compilar el proyecto con Maven
$ mvn clean install
```
El programa proporciona opciones interactivas para buscar, almacenar y gestionar libros.

## Dependencias

Literalura utiliza las siguientes bibliotecas y herramientas:

- **Jackson**: para manejar el procesamiento JSON y comunicarse con la API de Gutendex.
- **JPA (Java Persistence API)**: para interactuar con la base de datos.
- **SQL**: para el almacenamiento y la gestión de los datos de los libros.

Estas dependencias están configuradas en el archivo `pom.xml`.



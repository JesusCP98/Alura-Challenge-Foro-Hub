# Foro Hub: API REST para Tópicos de Discusión

Este proyecto implementa una API REST para un foro online utilizando Java y Spring Boot. Los usuarios pueden crear, leer, actualizar y eliminar tópicos de discusión. Además, se incluye autenticación y autorización mediante tokens JWT.

## Características

- Operaciones CRUD para tópicos:
  - Crear un nuevo tópico.
  - Mostrar todos los tópicos.
  - Mostrar un tópico específico.
  - Actualizar un tópico existente.
  - Eliminar un tópico.

- Principios RESTful aplicados a las rutas de la API.

- Validaciones según reglas de negocio.

- Persistencia de datos en MySQL.

- Autenticación y autorización mediante tokens JWT.

## Configuración del entorno de desarrollo

- **Java JDK**: Versión 17
- **Maven**: Versión 4
- **Spring Boot**: Versión 3.3.0
- **MySQL**: Versión 8.0
- **IDE**: IntelliJ IDEA

## Dependencias (pom.xml)

```xml
<dependencies>
    <!-- ... Otras dependencias ... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- ... Otras dependencias ... -->
    <!-- Agrega las dependencias necesarias para Spring Web, Spring Data JPA, Flyway, etc. -->
</dependencies>

## Configuración de la base de datos (application.properties)

spring.application.name=literatula_desafio
spring.datasource.url=jdbc:postgresql://${DB_HOST}/challenge_foro_hub
spring.datasource.username=${DB_Users}
spring.datasource.password=${DB_password}

Recuerda reemplazar ${DB_HOST}, ${DB_Users} y ${DB_password} con los valores correspondientes de tu entorno.

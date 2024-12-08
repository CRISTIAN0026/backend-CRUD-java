# backend-CRUD-java
# Gestión de Hospital - Aplicación Spring Boot

Este repositorio implementa una aplicación básica para la gestión de un sistema hospitalario utilizando **Spring Boot**. Este proyecto sirve como punto de partida para desarrollar APIs RESTful en Java.

---

## **Estructura del Proyecto**

- **`HospitalApplication`**: Archivo principal que inicia la aplicación utilizando el framework Spring Boot.

---

## **Código Principal**

El punto de entrada de la aplicación está definido en el archivo `HospitalApplication.java`:

```java
package com.example.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
}

# ☕ Práctica Java

Repositorio donde subo mis ejercicios y proyectos mientras aprendo Java. La idea es ir documentando el proceso: desde ejercicios básicos hasta proyectos más completos aplicando programación orientada a objetos (POO).

## 📚 Contenido

| Proyecto | Descripción | Conceptos aplicados |
|---|---|---|
| [`Biblioteca`](./Biblioteca) | Modelado de una biblioteca que gestiona una colección de libros | Clases, encapsulamiento, agregación, `ArrayList` |
| [`ComposiciónyAgregación`](./ComposiciónyAgregación) | Ejercicios de práctica sobre relaciones de agregación y composición en Java | Clases, agregación, composición |
| [`Empresa`](./Empresa) | Modelado de una empresa con distintos tipos de empleados (Gerente, Vendedor) | Herencia, `extends`, `super`, sobrescritura de métodos (polimorfismo), `protected` |
| [`TP1 - Bases de Datos`](./TP1%20-%20Bases%20de%20Datos) | Modelado de dos sistemas (campañas de marketing digital y comunidad de videojuegos), con clases de asociación para relaciones muchos a muchos | Encapsulamiento, asociación entre clases, relaciones N:M, Spring Boot, `CommandLineRunner` |

> Esta tabla se va a ir actualizando a medida que suba nuevos proyectos.

## 🧠 Conceptos que voy practicando

- Clases y objetos
- Encapsulamiento (atributos privados/protegidos, getters y setters)
- Relaciones entre clases: asociación, agregación y composición
- Herencia (`extends`, `super`) y polimorfismo (`@Override`)
- Colecciones (`ArrayList`, `HashMap`)
- Manejo de excepciones
- Spring Boot básico (`@Component`, `CommandLineRunner`)

## 🗂️ Estructura del repositorio

Cada carpeta corresponde a un ejercicio o proyecto independiente, con sus propias clases y una clase `Main` para probarlo (o, en el caso de proyectos con Spring Boot, una clase `Runner` que cumple ese rol).

## ▶️ Cómo correr un proyecto

Para los ejercicios simples (sin Spring Boot):

```bash
cd NombreDelProyecto
javac *.java
java Main
```

Para proyectos con Spring Boot (como `TP1 - Bases de Datos`), abrir la carpeta del proyecto con IntelliJ IDEA y ejecutar la clase principal anotada con `@SpringBootApplication`.

## 🎯 Objetivo

Este repo es principalmente para práctica personal y seguimiento de mi aprendizaje en la facultad/curso de Java. Si encontrás algo para mejorar o corregir, ¡los comentarios son bienvenidos!

## 🛠️ Tecnologías

- Java (JDK 25)
- IntelliJ IDEA
- Spring Boot

---

📌 *Repositorio en construcción — se irán agregando más ejercicios con el tiempo.*

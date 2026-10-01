# ☕ Práctica Java

Repositorio donde subo mis ejercicios y proyectos mientras aprendo Java. La idea es ir documentando el proceso: desde ejercicios básicos hasta proyectos más completos aplicando programación orientada a objetos (POO).

## 📚 Contenido

| Proyecto | Descripción | Conceptos aplicados |
|---|---|---|
| [`Biblioteca`](./Biblioteca) | Modelado de una biblioteca que gestiona una colección de libros | Clases, encapsulamiento, agregación, `ArrayList` |
| [`Composición y Agregación`](./Composición%20y%20Agregación) | Ejercicios de práctica sobre relaciones de agregación y composición en Java | Clases, agregación, composición |
| [`Empresa`](./Empresa) | Modelado de una empresa con distintos tipos de empleados (Gerente, Vendedor) | Herencia, `extends`, `super`, sobrescritura de métodos (polimorfismo), `protected` |
| [`Modelado de Clases - Bases de Datos`](./Modelado%20de%20Clases%20-%20Bases%20de%20Datos) | Modelado de dos sistemas (campañas de marketing digital y comunidad de videojuegos), con clases de asociación para relaciones muchos a muchos | Encapsulamiento, asociación entre clases, relaciones N:M, Spring Boot, `CommandLineRunner` |
| [`Usuarios DTO Proyecto`](./Usuarios%20DTO%20Proyecto) | API REST de usuarios con arquitectura en capas (Controller → Service → Repository) conectada a PostgreSQL. Endpoint `GET /usuarios` funcionando y probado con Postman; `GET` y `POST`  funcionando | Spring Boot, Spring Data JPA, Hibernate, PostgreSQL, Entity, DTO, inyección de dependencias, API REST |

> Esta tabla se va a ir actualizando a medida que suba nuevos proyectos.

## 🧠 Conceptos que voy practicando

- Clases y objetos
- Encapsulamiento (atributos privados/protegidos, getters y setters)
- Relaciones entre clases: asociación, agregación y composición
- Herencia (`extends`, `super`) y polimorfismo (`@Override`)
- Colecciones (`ArrayList`, `HashMap`)
- Manejo de excepciones
- Spring Boot básico (`@Component`, `CommandLineRunner`)
- Arquitectura en capas: Controller, Service, Repository y Entity
- Persistencia con JPA/Hibernate (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`)
- Repositorios con Spring Data JPA (`JpaRepository`)
- DTO (Data Transfer Object) para separar la API de la base de datos
- Inyección de dependencias (`@Service`, `@RestController`)
- API REST: `@GetMapping`, `@RequestMapping`
- Pruebas de endpoints con Postman

## 🗂️ Estructura del repositorio

Cada carpeta corresponde a un ejercicio o proyecto independiente, con sus propias clases y una clase `Main` para probarlo (o, en el caso de proyectos con Spring Boot, una clase `Runner` o `Application` que cumple ese rol).

El proyecto `Usuarios DTO Proyecto` sigue esta estructura de paquetes:

```
com.ejemplo.usuarios
├── controller   → recibe las peticiones HTTP (UserController)
├── service      → lógica de negocio y conversión a DTO (UserService)
├── repository   → acceso a la base de datos (UserRepository)
├── entity       → clases mapeadas a tablas (UserEntity)
└── dto          → objetos que viajan hacia el cliente (UserDTO)
```

## ▶️ Cómo correr un proyecto

Para los ejercicios simples (sin Spring Boot):

```bash
cd NombreDelProyecto
javac *.java
java Main
```

Para proyectos con Spring Boot (como `Modelado de Clases - Bases de Datos`), abrir la carpeta del proyecto con IntelliJ IDEA y ejecutar la clase principal anotada con `@SpringBootApplication`.

Para `Usuarios DTO Proyecto` además hace falta:

1. Tener PostgreSQL instalado y crear la base de datos `userdb`.
2. Configurar el usuario y la contraseña en `src/main/resources/application.properties`.
3. Ejecutar `UsuariosApplication` desde IntelliJ.
4. Probar con Postman: `GET http://localhost:8080/usuarios`.

## 🎯 Objetivo

Este repo es principalmente para práctica personal y seguimiento de mi aprendizaje en la facultad/curso de Java. Si encontrás algo para mejorar o corregir, ¡los comentarios son bienvenidos!

## 🛠️ Tecnologías

- Java (JDK 25)
- IntelliJ IDEA
- Maven
- Spring Boot (Spring Web, Spring Data JPA)
- PostgreSQL y pgAdmin 4
- Postman

---

📌 *Repositorio en construcción — se irán agregando más ejercicios con el tiempo.*

# 📇 Agenda de Contactos | Spring Boot + Thymeleaf

Aplicación web tipo **CRUD** desarrollada con **Java, Spring Boot, Thymeleaf, Spring Data JPA, MySQL y Bootstrap**.

Este proyecto permite gestionar una agenda de contactos desde una interfaz web sencilla, donde el usuario puede **registrar, visualizar, editar y eliminar contactos**.  
Fue desarrollado como práctica para reforzar conocimientos en desarrollo web con Java y arquitectura MVC.

---

## 🚀 Tecnologías utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

---

## ✨ Funcionalidades principales

- 📋 Listar contactos registrados.
- ➕ Agregar nuevos contactos.
- ✏️ Editar información de un contacto existente.
- 🗑️ Eliminar contactos.
- 💾 Guardar información en una base de datos MySQL.
- 🎨 Interfaz web responsive con Bootstrap.
- 🧩 Uso de fragmentos con Thymeleaf.
- 🧱 Arquitectura basada en el patrón MVC.

---

## 🖼️ Vista general del proyecto

La aplicación cuenta con una pantalla principal donde se muestran los contactos registrados en una tabla.  
Desde esta vista se pueden realizar las acciones principales del sistema:

- Crear contacto.
- Editar contacto.
- Eliminar contacto.
- Visualizar contactos guardados.

---

## 🧠 Arquitectura del proyecto

El proyecto está organizado en capas para mantener una estructura limpia y fácil de mantener:

```text
src/main/java/st/contactos
├── ContactosApplication.java
├── controlador
│   └── ContactoControlador.java
├── modelo
│   └── Contacto.java
├── repositorio
│   └── ContactoRepositorio.java
└── servicio
    ├── IContactoServicio.java
    └── ContactoServicio.java
```

Estructura de recursos:

```text
src/main/resources
├── application.properties
├── logback-spring.xml
└── templates
    ├── index.html
    ├── agregar.html
    ├── editar.html
    └── fragmentos
        ├── cabecero.html
        ├── navegacion.html
        └── pie-pagina.html
```

---

## 📌 Modelo de datos

La entidad principal del sistema es `Contacto`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContacto;

    private String nombre;
    private String celular;
    private String email;
}
```

### Campos del contacto

| Campo | Descripción |
|---|---|
| `idContacto` | Identificador único generado automáticamente |
| `nombre` | Nombre del contacto |
| `celular` | Número telefónico del contacto |
| `email` | Correo electrónico del contacto |

---

## 🖥️ Vistas del sistema

| Vista | Descripción |
|---|---|
| `index.html` | Muestra el listado principal de contactos |
| `agregar.html` | Formulario para registrar nuevos contactos |
| `editar.html` | Formulario para modificar contactos existentes |
| `cabecero.html` | Fragmento reutilizable para el encabezado |
| `navegacion.html` | Fragmento de barra de navegación |
| `pie-pagina.html` | Fragmento para scripts y cierre de página |

---

## ⚙️ Configuración de la base de datos

Antes de ejecutar el proyecto, crea una base de datos en MySQL.

```sql
CREATE DATABASE contactos_db;
```

Luego configura el archivo:

```text
src/main/resources/application.properties
```

Ejemplo de configuración:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contactos_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=tu_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> ⚠️ Importante: no subas contraseñas reales a GitHub.  
> Cambia `tu_password` por un valor de ejemplo o utiliza variables de entorno.

---

## ▶️ Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/agenda-contactos-springboot-thymeleaf.git
```

### 2. Entrar a la carpeta del proyecto

```bash
cd agenda-contactos-springboot-thymeleaf
```

### 3. Configurar MySQL

Verifica que MySQL esté activo y que la base de datos exista.

```sql
CREATE DATABASE contactos_db;
```

### 4. Ejecutar la aplicación

En macOS o Linux:

```bash
./mvnw spring-boot:run
```

En Windows:

```bash
mvnw.cmd spring-boot:run
```

### 5. Abrir en el navegador

```text
http://localhost:8080
```

---

## 🧪 Pruebas

Para ejecutar las pruebas del proyecto:

```bash
./mvnw test
```

---

## 📸 Capturas de pantalla

Puedes agregar capturas del sistema dentro de una carpeta llamada `screenshots`.

Ejemplo:

```text
screenshots/
├── inicio.png
├── agregar-contacto.png
└── editar-contacto.png
```

Luego puedes mostrarlas en el README así:

```markdown
![Vista principal](screenshots/inicio.png)
```

---

## 📚 Aprendizajes aplicados

Durante el desarrollo de este proyecto se aplicaron conceptos importantes como:

- Creación de aplicaciones web con Spring Boot.
- Uso del patrón MVC.
- Manejo de controladores con `@Controller`.
- Rutas con `@GetMapping` y `@PostMapping`.
- Persistencia de datos con Spring Data JPA.
- Conexión con base de datos MySQL.
- Creación de vistas dinámicas con Thymeleaf.
- Uso de fragmentos reutilizables en HTML.
- Diseño visual con Bootstrap.
- Uso de Lombok para reducir código repetitivo.
- Separación de responsabilidades por capas.

---

Nombre recomendado:

```text
agenda-contactos-springboot-thymeleaf
```

Descripción recomendada:

```text
Aplicación web CRUD para gestionar contactos, desarrollada con Spring Boot, Thymeleaf, Spring Data JPA, MySQL y Bootstrap.
```

---

## 🏷️ Topics recomendados para GitHub

```text
java
spring-boot
thymeleaf
spring-data-jpa
mysql
crud
bootstrap
mvc
maven
```

---

## 👨‍💻 Autor

Desarrollado por **Samahel Thomas**.

Proyecto creado como práctica de desarrollo web con **Java, Spring Boot, Thymeleaf y MySQL**.


# Todo Application

A simple Todo Management Web Application built using **Java, Spring Boot, PostgreSQL, and Thymeleaf**. This project allows users to add and view tasks, with data stored persistently in a PostgreSQL database.

## Features

- Add new tasks.
- Store tasks in PostgreSQL.
- Retrieve and display all saved tasks.
- Automatically refresh the task list after adding a task.

## Tech Stack

- **Language:** Java
- **Backend:** Spring Boot
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA / Hibernate
- **Frontend:** HTML, Thymeleaf
- **Build Tool:** Maven

## Project Structure

```text
todo/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/newtodo/
│       │       ├── controller/
│       │       ├── model/
│       │       └── repository/
│       └── resources/
│           ├── templates/
│           │   └── index.html
│           └── application.properties
├── pom.xml
└── README.md
```

## Database Configuration

1. Install PostgreSQL.
2. Create a database named `todo_db`.
3. Configure your database credentials using environment variables.

Example `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5500/todo_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## How to Run

1. Clone this repository.
2. Open the `todo` project in IntelliJ IDEA.
3. Configure PostgreSQL credentials.
4. Run the Spring Boot application.
5. Open your browser and visit:

```text
http://localhost:8080/
```

## Learning Objectives

- Understanding Spring Boot MVC architecture.
- Working with REST and HTTP request mappings.
- Connecting Spring Boot with PostgreSQL.
- Performing database operations using Spring Data JPA.
- Understanding the flow between Controller, Repository, Model, and View.

## Author

**Jatin Hasija**


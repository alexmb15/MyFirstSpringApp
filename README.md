
# Students REST API

![Java](https://img.shields.io/badge/Java-21-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen.svg)
![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)

A simple **CRUD Spring Boot application** that shows how to combine  
*Spring Data JPA*, *PostgreSQL* and *Lombok* around a single **Student** entity.


## Features
* List all students  
* Find a student by **e-mail**  
* Create, update and delete students  
* The **age** field is calculated on-the-fly (`@Transient`)  
* Spring Boot Actuator endpoints (`/actuator/health`, `/metrics`, …)


## Tech Stack

| Category | Tech |
|----------|------|
| Language | **Java 21** |
| Runtime  | **Spring Boot 3.5.3** |
| Build    | **Maven Wrapper** (`mvnw`) |
| Database | **PostgreSQL** |
| ORM      | **Spring Data JPA / Hibernate** |
| Boilerplate | **Project Lombok** |
| Tests | JUnit 5, Spring Boot Test |

## REST Endpoints

| Verb | URI | Description |
|------|-----|-------------|
| GET  | `/api/v1/students` | list all students |
| GET  | `/api/v1/students?email={email}` | find by e-mail |
| POST | `/api/v1/students/save_student` | create a new student |
| PUT  | `/api/v1/students/update_student` | update an existing student |
| DELETE | `/api/v1/students/delete_student?email={email}` | delete by e-mail |

### cURL examples
```bash
# Add a student
curl -X POST http://localhost:8080/api/v1/students/save_student \
     -H "Content-Type: application/json" \
     -d '{\"firstName\":\"Alice\",\"lastName\":\"Moore\",
          \"email\":\"alice@example.com\",
          \"dateOfBirth\":\"2001-04-12\"}'

# List all
curl http://localhost:8080/api/v1/students
```

## License
Released under the **MIT License**.

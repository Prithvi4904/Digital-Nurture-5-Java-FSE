# Module 5: Spring Core & Spring Boot 🍃

This module contains exercises related to setting up Spring applications. To maintain a clean architecture, the exercises are divided into two completely independent Maven projects.

## 📂 1. Spring-Core-LibraryManagement
This project covers the fundamentals of the **Spring Framework** using traditional XML-based configuration. 
*   **Exercise 1:** Configuring a Basic Spring Application (IoC Container & Bean Definitions)
*   **Exercise 2:** Implementing Dependency Injection (Wiring Beans)
*   **Exercise 4:** Creating and Configuring a Maven Project (Java 8, Spring 5.x Dependencies)
*   **Exercise 5:** Configuring the Spring IoC Container
*   **Exercise 7:** Implementing Constructor and Setter Injection

*To run: Execute the `LibraryManagementApplication.java` main class.*

## 📂 2. SpringBoot-LibraryManagement
This project covers the modern **Spring Boot** framework, demonstrating how auto-configuration and Spring Data JPA drastically reduce boilerplate code.
*   **Exercise 9:** Creating a Spring Boot Application
    *   REST API (`@RestController`)
    *   Spring Data JPA (`@Entity`, `JpaRepository`)
    *   H2 In-Memory Database integration (`application.properties`)

*To run: Execute the `LibraryManagementApplication.java` main class and test the REST endpoints at `http://localhost:8080/api/books`.*

## 🛠️ Technical Specifications
*   **Java Version:** 1.8 (Java 8)
*   **Spring Framework:** 5.3.x
*   **Spring Boot:** 2.7.x

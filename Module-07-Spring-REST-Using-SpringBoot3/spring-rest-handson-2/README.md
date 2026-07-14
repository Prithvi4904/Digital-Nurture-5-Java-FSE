# Spring REST Hands-on 2

This project is a Spring Boot application demonstrating the creation of RESTful web services.

## Features
- REST Controllers for managing Countries and Employees
- Custom Exception Handling using `@RestControllerAdvice`
- XML-based bean configuration loaded via `ClassPathXmlApplicationContext`
- Layered architecture (Controller, Service, Dao)

## Technologies Used
- Java 17
- Spring Boot (Spring Web, Spring Context)
- Maven

## Endpoints
- **GET** `/hello` - Returns a simple greeting
- **GET** `/countries` - Returns a list of countries
- **GET** `/countries/{code}` - Returns a specific country
- **GET** `/employees` - Returns a list of employees
- **GET** `/employees/{id}` - Returns a specific employee

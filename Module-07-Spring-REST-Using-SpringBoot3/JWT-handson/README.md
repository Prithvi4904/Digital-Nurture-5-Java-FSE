# JWT-handson (Spring Boot 2 / Java 8)

This is a Hands-on project for demonstrating JWT Authentication using Spring Security and JSON Web Tokens (JJWT).

## Technologies Used
* Java 8 (1.8)
* Spring Boot 2.7.18
* Spring Security (WebSecurityConfigurerAdapter)
* JJWT 0.9.0
* XML Bean Configuration (`country.xml`)

## Features
* Secure endpoints using Spring Security and JWT.
* Basic authentication filter for the `/authenticate` endpoint.
* Custom JWT Authorization Filter to validate Bearer tokens.
* Exception Handling using `@RestControllerAdvice`.

## Endpoints
* **`GET /authenticate`**: Supply Basic Auth credentials (e.g., `user`/`pwd` or `admin`/`pwd`) to receive a JWT Token.
* **`GET /countries/{code}`**: Secured endpoint to fetch a country by its code (Requires `Authorization: Bearer <token>` header).

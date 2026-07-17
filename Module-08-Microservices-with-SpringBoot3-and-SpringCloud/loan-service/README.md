# Loan Service

A Spring Boot microservice that provides loan-related information.

## Configuration
- **Port:** 8082
- **Application Name:** `loan-service`
- **Dependencies:** `spring-boot-starter-web`, `spring-cloud-starter-netflix-eureka-client`

## Endpoints
- `GET /loan`: Returns a dummy `Loan` object containing loan details and amount.

## Details
This microservice registers automatically with the Eureka Discovery Server running on port 8761.

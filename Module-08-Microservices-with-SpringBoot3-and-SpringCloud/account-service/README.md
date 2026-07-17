# Account Service

A Spring Boot microservice that provides account-related information.

## Configuration
- **Port:** 8081
- **Application Name:** `account-service`
- **Dependencies:** `spring-boot-starter-web`, `spring-cloud-starter-netflix-eureka-client`

## Endpoints
- `GET /account`: Returns a dummy `Account` object containing account details and balance.

## Details
This microservice registers automatically with the Eureka Discovery Server running on port 8761.

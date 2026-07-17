# Discovery Server

This module acts as the Eureka Service Registry for the microservices architecture.

## Configuration
- **Port:** 8761
- **Application Name:** `discovery-server`
- **Dependencies:** `spring-cloud-starter-netflix-eureka-server`

## Details
This application uses `@EnableEurekaServer` to stand up a service registry. The client registry features (`register-with-eureka` and `fetch-registry`) are disabled as it acts solely as a server.

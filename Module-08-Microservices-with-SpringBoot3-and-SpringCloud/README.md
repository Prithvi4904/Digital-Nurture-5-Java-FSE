# Module 8: Microservices with Spring Boot 3 and Spring Cloud

This repository contains the implementation of a microservices architecture using Spring Boot 3 and Spring Cloud, fulfilling the requirements for the Cognizant Java FSE Module 8.

## Project Structure
The solution consists of four main components:
1. **Discovery Server (Eureka)**: Service registry running on port `8761`.
2. **Account Service**: A microservice providing account details, running on port `8081`.
3. **Loan Service**: A microservice providing loan details, running on port `8082`.
4. **API Gateway**: Spring Cloud Gateway routing requests to respective microservices, running on port `9090`.

## Setup and Execution
To run this project, start the services in the following order:
1. `discovery-server`
2. `account-service`
3. `loan-service`
4. `api-gateway`

Once running, the microservices will register themselves with the Eureka Server. You can access the gateway endpoints at:
- Account Service: `http://localhost:9090/account`
- Loan Service: `http://localhost:9090/loan`

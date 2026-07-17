# API Gateway

This module acts as the single entry point for all external requests, routing them to the appropriate backend microservices.

## Configuration
- **Port:** 9090
- **Application Name:** `api-gateway`
- **Dependencies:** `spring-cloud-starter-gateway-server-webflux`, `spring-cloud-starter-netflix-eureka-client`

## Routing Configuration
The gateway dynamically routes traffic using Eureka's load balancing (`lb://`) mechanisms:
- Path `/account/**` -> Routes to `ACCOUNT-SERVICE`
- Path `/loan/**` -> Routes to `LOAN-SERVICE`

## Details
This gateway also registers with the Eureka Server to locate instances of the downstream services.

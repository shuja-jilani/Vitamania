# Vitamania

## Overview

Vitamania is a production-oriented full stack health supplements platform being built to learn and demonstrate modern backend engineering and cloud-native architecture.

This project focuses on:

* Spring Boot architecture
* Production-grade backend development
* Distributed systems concepts
* Docker and Kubernetes
* Infrastructure engineering
* Secure authentication and authorization
* Clean architecture and maintainability

---

# Current Tech Stack

## Backend

* Java
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Security
* Spring Boot Actuator
* Flyway
* Lombok

## Infrastructure

* PostgreSQL 16
* Redis 7
* Docker Compose

## Planned Stack

* React / Next.js
* Kafka
* Keycloak
* Kubernetes
* Helm
* Terraform
* ELK Stack

---

# Project Structure

vitamania/

* vitamania-backend/
* vitamania-frontend/
* infrastructure/
* docs/

Backend package structure:

src/main/java/com/vitamania

* auth/
* products/
* common/
* config/
* exception/
* shared/

---

# Features Implemented So Far

## Infrastructure

* PostgreSQL containerized with Docker
* Redis containerized with Docker
* Environment variable configuration using .env
* Flyway database migration setup
* UTC timezone standardization

## Backend Foundation

* Spring Boot initialization
* Maven wrapper setup
* Health monitoring with Spring Boot Actuator
* Global exception handling
* Standardized API response structures
* Logging setup with SLF4J + Logback
* Security configuration foundation

---

# Running The Project

## Start Infrastructure

Go to infrastructure folder and run:

docker compose up -d

Verify containers:

docker ps

---

# Running Backend

Go to vitamania-backend folder and run:

./mvnw spring-boot:run

Or run using IntelliJ.

---

# Environment Variables

Example .env file:

DB_URL=jdbc:postgresql://localhost:5432/vitamania?options=-c%20TimeZone=UTC

DB_USERNAME=postgres

DB_PASSWORD=postgres

REDIS_HOST=localhost

REDIS_PORT=6379

---

# Health Endpoint

GET /actuator/health

Used for:

* application monitoring
* Docker health checks
* Kubernetes liveness/readiness probes

---

# Exception Handling

The project uses centralized exception handling using:

@RestControllerAdvice

Benefits:

* consistent error responses
* cleaner controllers
* centralized exception management

Example error response:

{
"timestamp": "2026-05-13T10:00:00Z",
"status": 404,
"error": "Not Found",
"message": "Product not found",
"path": "/products/1"
}

---

# Logging

Logging uses:

* SLF4J
* Logback
* Lombok @Slf4j

Logging levels:

* INFO
* DEBUG
* WARN
* ERROR

---

# Database Migrations

Flyway is used for schema versioning.

Migration location:

src/main/resources/db/migration

Naming convention:

V1__description.sql

---

# Development Goals

* Build production-grade backend architecture
* Learn distributed systems concepts deeply
* Implement secure authentication with Keycloak
* Introduce Kafka-based event-driven architecture
* Deploy to Kubernetes using Helm/Terraform
* Build observability stack
* Follow clean code and engineering best practices

---

# Notes

This project is intentionally being built step-by-step with focus on:

* conceptual clarity
* production readiness
* maintainability
* engineering discipline

The purpose is not only to build an application, but to become a stronger backend and cloud-native engineer through hands-on implementation.

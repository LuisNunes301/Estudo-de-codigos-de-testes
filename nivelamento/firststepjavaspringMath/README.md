# Mini Project: Spring Boot Application for Basic Mathematical Operations
============================================================

### Overview

This mini project demonstrates a simple Spring Boot application that performs basic mathematical operations using request parameters. The application provides four endpoints for addition, subtraction, multiplication, and division.

### Features

* Performs basic mathematical operations: addition, subtraction, multiplication, and division
* Uses request parameters to pass operands
* Handles division by zero error

### Endpoints

#### Addition

* **Endpoint:** `/add`
* **Request Parameters:** `num1` and `num2`
* **Example:** `http://localhost:8080/add?num1=2&num2=3`

#### Subtraction

* **Endpoint:** `/subtract`
* **Request Parameters:** `num1` and `num2`
* **Example:** `http://localhost:8080/subtract?num1=5&num2=2`

#### Multiplication

* **Endpoint:** `/multiply`
* **Request Parameters:** `num1` and `num2`
* **Example:** `http://localhost:8080/multiply?num1=4&num2=5`

#### Division

* **Endpoint:** `/divide`
* **Request Parameters:** `num1` and `num2`
* **Example:** `http://localhost:8080/divide?num1=10&num2=2`

**Note:** Replace `localhost:8080` with the actual URL and port of your running Spring Boot application.

### Code Structure

The project consists of a single `MathController` class that handles the mathematical operations.

* `MathController.java`: Contains the implementation of the mathematical operations using request parameters.

### Getting Started

1. Clone the repository and import the project into your preferred IDE.
2. Run the Spring Boot application using your IDE or by executing the `main` method in `MathController.java`.
3. Use a tool like Postman or cURL to send GET requests to the endpoints with the required request parameters.
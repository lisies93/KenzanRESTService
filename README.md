# Kenzan REST Service

## Overview
This project is a REST API server delivering basic CRUD functionality for Employees. For this specific project I've created a Spring boot app, Spring Data JPA is used to simplify coding of the API, so no explicit EntityManager objects or JPQL queries need be included. In addition to basic CRUD functionality.

## Technologies Used
JSON
Java 8
JPA
JUnit testing
MAMP
MySQL
MySQL Workbench
Postman
Tomcat
Spring Tool Suite
SpringBoot / Spring Data JPA
Spring REST / API

## Postman tests
All tests are meant to be run in postman using the included endpoint mapping.

### JSON for POST test.
{ "firstName": "Karen",
        "middleInitial": "A",
        "lastName": "Mena",
        "dateOfBirth": "1986-03-09",
        "dateOfEmployment": "2021-06-29" }

### Delete an entry. Method type "DELETE"
This call requieres Basic Authorization header.
user : kenzan
password : kenzan


## REST API endpoints and their functionality are as follows:

|      HTTP Method       |     Resource URI                |      Request Body             |       Returns                           |
|------------------------|---------------------------------|-------------------------------|-----------------------------------------|
| GET                    |     `api/employees`             |                               | a list of all active employees          |
| GET                    |     `api/employees/all`         |                               | a list of all employees in database     |
| GET                    |  `api/employees/{id}`           |                               | a single employee by id                 |
| POST                   |     `api/employees`             |  a new employee entry         | employee that was created               |
| PUT                    |    `api/employees/{id}`         | an existing employee to update| employee that was updated               |
| DELETE                 |      `api/employees/{id}`       |                               | deletes an employee (makes it inactive) |

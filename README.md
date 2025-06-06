# Roomie - System for managing room and flat reservations

Roomie is a multi-access system for managing room and flat reservations. 
The system is build using a three-layers architecture. Roomie consists of the following layers:
- Data layer
- Business logic layer
- Presentation layer

### 1. Data layer (database)
The data layer is responsible for storing data. Data layer is implemented using the PostgreSQL Relational DataBase Management 
System (RDBMS), which processes database transations in accordance with the ACID properties. 

### 2. Business logic layer (web application)
The business logic layer is responsible for processing business rules and application logic. It is implemented as web
application built using Spring Boot framework. Web app users Object-Relational Mapping (ORM) and transaction processing.
Web app provides REST API. 

### 3. Presentation layer (single page application)
The presentation layer provides a Graphical User Interface (GUI) implemented as Single Page Application (SPA). The SPA 
is built using React library. The SPA sends HTTP request to the web application and displays the appropriate page views.
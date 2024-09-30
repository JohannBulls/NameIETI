# NameIETI - Spring Boot REST Service

## Overview
NameIETI is a simple Spring Boot application that provides a REST endpoint to return the developer's name. It includes a unit test to verify the functionality of the endpoint.

## Features
- Exposes a REST API that responds with a static name.
- Implements unit testing using **JUnit** and **MockMvc** to validate the behavior of the endpoint.

## Requirements
- Java 17
- Maven 3.x
- Spring Boot 3.3.4

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/JohannBulls/NameIETI.git
   cd NameIETI
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the REST endpoint at:
   ```bash
   http://localhost:8080/name
   ```

## REST Endpoint

- **GET** `/name`  
  Returns a static string: `"My name is Johann Amaya"`

## Live Deployment
The application is deployed on Railway and can be accessed at the following URL:
```bash
    https://nameieti-production.up.railway.app/name
```

## Testing

To run the tests:
```bash
mvn test
```

## Project Dependencies

- **Spring Boot Starter Web**: For building RESTful web services.
- **Spring Boot Starter Test**: For unit and integration testing.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

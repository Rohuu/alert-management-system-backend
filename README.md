
The Alert Management System is a Java backend project developed using the Spring Boot framework. This system provides two REST endpoints, namely Authentication and Notification, to manage alerts and send email notifications.

## Frameworks and Dependencies Used

The project is built using the following frameworks and dependencies:

- Spring Boot: Version 2.7.15
- Spring Security
- Spring Data JPA
- oauth2 resource server
- spring-boot-configuration-processor
- JSON Web Token (JWT)
- SLF4J (Simple Logging Facade for Java)
- Lombok
- PostgreSQL

## Installation and Setup

Follow the steps below to install and run the project locally:

### Prerequisites

- Java Development Kit (JDK) 17
- PostgreSQL database
- Gradle build tool (optional, as the project includes a Gradle wrapper)

### Clone the Repository

1. Clone the repository to your local machine using Git:

   ```
   SSH key setup: git clone git@github.com:Rohuu/alert-management-system-backend.git
   HTTPS setup: git clone https://github.com/Rohuu/alert-management-system-backend.git
   ```

### Database Configuration

2. Create a PostgreSQL database for the project.

### Configure Database Properties

3. Open the `application.properties` file located in the `src/main/resources` directory and configure the database connection properties.
4. Update the following properties with your database details:

   ```properties
   spring.datasource.url=jdbc:postgresql://<database_host>:<database_port>/<database_name>
   spring.datasource.username=<database_username>
   spring.datasource.password=<database_password>
   ```

### Build and Run the Project

4. Open a terminal and navigate to the project's root directory.

5. Build the project using the Gradle wrapper (if Gradle is not installed):

   ```
   ./gradlew build
   ```

   If Gradle is already installed, you can use the `gradle` command instead.

6. Run the project:

   ```
   ./gradlew bootRun
   ```

   This command will start the Spring Boot application, and it will be accessible at `http://localhost:8080`.


## Usage

You can use API testing tools like Postman or cURL to interact with the provided endpoints. 

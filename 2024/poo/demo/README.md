# Demo Spring Boot

## Prerequisites

1. OpenJDK Runtime Environment
2. Apache Maven
3. Spring Boot Project from https://start.spring.io/.
4. Postman

## Dependencies

Spring Boot provides a number of starters that let you add jars to your classpath. Starters provide dependencies that you are likely to need when developing a specific type of application.

1. spring-boot-starter-web
2. spring-boot-starter-data-jpa
3. h2database
4. spring-boot-devtool
5. lombok

## Running the Example

### Development

mvn spring-boot:run

### Creating an Executable Jar

1. To create an executable jar, we need to add the spring-boot-maven-plugin to our pom.xml
2. mvn package
3. C:\software\jdk-22.0.2\bin\java -jar target/demo-0.0.1-SNAPSHOT.jar

### H2 Console

http://localhost:8080/h2-console
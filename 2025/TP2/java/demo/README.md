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

http://localhost:9090/h2-console

### GIT

git add .
git commit -m "first commit"
git push -u origin main

git branch develop
git push -u origin develop
git checkout develop


Git add .
git commit -m "User commit"
git push -u origin develop


git checkout main
git merge develop
Git add .
git commit -m "User Mege commit"
git push -u origin main


git tag -a v0.1 -m "my version 0.1"
git push --follow-tags

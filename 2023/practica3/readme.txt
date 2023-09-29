Ejercicio práctico

	Generate project:

		https://start.spring.io/
		
		Spring tool Suite:
			File-> Spring Starter Project
			
	Check pom.xml file:
	
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-jdbc</artifactId>
            </dependency>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-devtools</artifactId>
                <scope>runtime</scope>
                <optional>true</optional>
            </dependency>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-test</artifactId>
                <scope>test</scope>
                <exclusions>
                    <exclusion>
                        <groupId>org.junit.vintage</groupId>
                        <artifactId>junit-vintage-engine</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>
            </dependency>
            <dependency>
                <groupId>org.postgresql</groupId>
                <artifactId>postgresql</artifactId>
                <scope>runtime</scope>
            </dependency>
        </dependencies>

    Run from terminal:
    
        ./mvnw spring-boot:run

        Or using IDE.


    ERROR:

	Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
	2020-10-09 19:11:05.884 ERROR 27536 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : 

	***************************
	APPLICATION FAILED TO START
	***************************

	Description:

	Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

	Reason: Failed to determine a suitable driver class


    Fix the issue:

        Add the following statement in application.properties file:

        spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/postgres
        spring.datasource.driverClassName=org.postgresql.Driver
        spring.datasource.username=postgres
        spring.datasource.password=secret
        spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
        
    Community Editor (use it if you want): https://dbeaver.io/


    Download latest revision from https://hub.docker.com/_/postgres 

    Remove old containers
        docker rm $(docker ps -q -f status=exited)

    Run postgress
        docker run --name some-postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=secret -p 5432:5432 -d postgres

    NOTICE: 
        Change postgres database to a new one. Such as Web. Don't forget change spring.datasource.url property as well.

    GIT
        git init
        git remote add origin <*.git>
        echo "target/" > .gitignore
        echo "Demo" >> README.md
        git add README.md .gitignore
        git commit -m "first commit"
        git branch -M master
        git push -u origin master

        git branch develop
        git checkout develop
        git add .
        git commit -m "my project commit"
        git push --set-upstream origin develop

        git checkout master
        git merge develop
        git add .
        git push -u origin master

        git tag -a v0.0.1 -m "my version 0.0.1"
        git push origin v0.0.1

HTTP

	¿Qué es y cómo funciona el protocolo HTTP?
	https://www.w3.org/Protocols/HTTP/1.1/rfc2616bis/draft-lafon-rfc2616bis-03.html

	Mencionar los métodos o verbos de HTTP: GET, POST
	https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html

	¿Los request de tipo POST tiene un body? ¿Y los de tipo GET?
	https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html

	Códigos de estado de response HTTP: Describa los código: 200, 201, 400, 401, 403
	y 500
	https://www.w3.org/Protocols/HTTP/HTRESP.html


Spring.io
	Spring Web MVC:

		○ Describa el propósito de las anotaciones @Controller y @ResquestMapping
			https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
			https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html
			https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html
		
		○ Menciones que otras anotaciones complementan a ResquestMapping para machear los distintos métodos de HTTP.
			https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
			
		○ ¿Cuál es el propósito de la anotación @Service?
			https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html
		
		○ Para que se usa la anotación @Autowired
			https://www.baeldung.com/spring-autowire
			https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html

	Spring-boot: Explique brevemente el propósito de este projecto de Spring
		https://spring.io/projects/spring-boot
		
	Descarga de Proyecto: https://start.spring.io/
	
Ejercicio práctico

	Generación del proyecto:
		https://start.spring.io/
		
		Spring tool Suite:
			File-> Spring Starter Project
			
	pom.xml:
	
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
	
	Posicionarse sobre el directorio del proyecto e inicializar el versionado con Git:
	
	Secuencia de comandos:
	
	git init
	git remote add origin <*.git>
	echo "target/" > .gitignore
	echo "Proyecto del ISFDyt5" >> README.md
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
	git pull
	git tag -a v0.0.1 -m "my version 0.0.1"
	git push origin v0.0.1

	git pull origin release
	
	¿Cual es el propósito de la clase generada por el asistente que tiene la notacion
	@SpringBootApplication?
	https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html
	

	ERROR:

	Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
	2020-10-09 19:11:05.884 ERROR 27536 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   : 

	***************************
	APPLICATION FAILED TO START
	***************************

	Description:

	Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

	Reason: Failed to determine a suitable driver class


	Action:

	Consider the following:
		If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
		If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).


	En application.properties

	spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/web
	spring.datasource.driverClassName=org.postgresql.Driver
	spring.datasource.username=postgres
	spring.datasource.password=secret
	spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
	
	Editor de Base de datos de la comunidad: https://dbeaver.io/
	

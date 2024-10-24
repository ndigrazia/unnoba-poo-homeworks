sudo docker run --name keycloak -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin -p 8180:8080 jboss/keycloak

https://medium.com/devops-dudes/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e

/bookings/*
users, admin


/bookings/rooms/* users
/bookings/orders/* users
/bookings/invoices/* users
/booking/config/* admin


Other Option

Install - 	Distribution powered by Quarkus

https://www.keycloak.org/downloads

Download "Distribution powered by Quarkus"
Extract file zip
Open the keycloak zip folder, and then open the Readme file:


				Keycloak
				========

				To understand the contents of your Keycloak installation, see the [directory structure guide](https://www.keycloak.org/server/directory-structure).

				To get help configuring Keycloak via the CLI, run:

				on Linux/Unix:

					$ bin/kc.sh

				on Windows:

					$ bin\kc.bat

				To try Keycloak out in development mode, run: 

				on Linux/Unix:

					$ bin/kc.sh start-dev

				on Windows:

					$ bin\kc.bat start-dev

				After the server boots, open http://localhost:8080 in your web browser. The welcome page will indicate that the server is running.

				To get started, check out the [configuration guides](https://www.keycloak.org/guides#server).


Token:

curl --location 'http://localhost:8080/realms/Demo-Realm/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id=springboot-microservice' \
--data-urlencode 'client_secret=dmKzVFwBRgKjrTGeaA1MM0vvAmbDrDYa' \
--data-urlencode 'username=user1' \
--data-urlencode 'password=123456'
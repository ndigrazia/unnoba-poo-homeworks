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


Create 	Realm: Demo-Realm
		Client: springboot-microservice
		Roles: admin, user
		Realm Roles:	app-admin, app-user
		User: 	user1
Token:

curl --location 'http://localhost:8080/realms/Demo-Realm/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'client_id=springboot-microservice' \
--data-urlencode 'client_secret=dmKzVFwBRgKjrTGeaA1MM0vvAmbDrDYa' \
--data-urlencode 'username=user1' \
--data-urlencode 'password=123456'

{
 "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIwZFhCdGdMTTZIQ19pMkJ1QmV0RXNHTjF2Vmg1Qk1XYzFCZzRsUDVyNEh3In0.eyJleHAiOjE3Mjk3OTg1NTUsImlhdCI6MTcyOTc5ODI1NSwianRpIjoiNTMyMzBlYWEtYjMxOC00NTIzLWI3NjEtMDU5ZjljZTY0M2M5IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9EZW1vLVJlYWxtIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjJhMTg3MDI5LWQ0NDYtNDZkNi04NzAxLWJlZDE4Mjg2ODU2OCIsInR5cCI6IkJlYXJlciIsImF6cCI6InNwcmluZ2Jvb3QtbWljcm9zZXJ2aWNlIiwic2lkIjoiYzI0ZjM2NjktNjAyZS00YjkyLWFjNjQtMDhlMDQ0ZTBmNjZkIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vbG9jYWxob3N0OjgwOTAiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwiYXBwLWFkbWluIiwiZGVmYXVsdC1yb2xlcy1kZW1vLXJlYWxtIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJzcHJpbmdib290LW1pY3Jvc2VydmljZSI6eyJyb2xlcyI6WyJhZG1pbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsIm5hbWUiOiJ1c2VyMSB1c2VyMSIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIxIiwiZ2l2ZW5fbmFtZSI6InVzZXIxIiwiZmFtaWx5X25hbWUiOiJ1c2VyMSIsImVtYWlsIjoidXNlcjFAbXlhcHBsaWNhdGlvbi5jb20ifQ.iCmijvArThu7BKZd6oK8nEYtqR3VGzp1fIllP_Hxe28gD5-Um32hFPnKdTmrkmDhWjUTLNy7zLnTJTNBJGJMzDe6tvurfJi0xklTSR2py0AepqAG6ha333l7yV1bUiRSv63b5rOd4TUEnbap74cWB5jHNcyRT8KRpNB-ML4wX8n1PaUhgVFmUV92uZv_owucSQD1LwkDZmHWW4igWSSiJ0hY-ahetDK_TSiG-mR9J7EtDLX2lFv75HtYCubtLk5IfdMPYafu21adjCnhewBGgPpgahnifsdW7y4wYwOU_U6vHwadF1Db2bzv9GuJsNGCwQqq3kMfGgwEpBKVm3EEog",
    "expires_in": 300,
    "refresh_expires_in": 1800,
    "refresh_token": "eyJhbGciOiJIUzUxMiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI4YTI3MmEyZC03ZTc2LTQyYTMtODZiMC0xYjdiZTQxOTVjNzIifQ.eyJleHAiOjE3Mjk4MDAwNTUsImlhdCI6MTcyOTc5ODI1NSwianRpIjoiZTg1Njc0YmMtMDBmOS00ZWFiLWFiZDMtNWJhYTBhMTk3ZWUzIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9EZW1vLVJlYWxtIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9EZW1vLVJlYWxtIiwic3ViIjoiMmExODcwMjktZDQ0Ni00NmQ2LTg3MDEtYmVkMTgyODY4NTY4IiwidHlwIjoiUmVmcmVzaCIsImF6cCI6InNwcmluZ2Jvb3QtbWljcm9zZXJ2aWNlIiwic2lkIjoiYzI0ZjM2NjktNjAyZS00YjkyLWFjNjQtMDhlMDQ0ZTBmNjZkIiwic2NvcGUiOiJiYXNpYyByb2xlcyBlbWFpbCBhY3Igd2ViLW9yaWdpbnMgcHJvZmlsZSJ9.sZtlJYJzp96vC-jMzjOSQnSJo-OLYkHASj7yMmotDMA65tVvK1taasWNXPSTY5cW7kkxgBhgtHMfkQNAJsy6_g",
    "token_type": "Bearer",
    "not-before-policy": 0,
    "session_state": "c24f3669-602e-4b92-ac64-08e044e0f66d",
    "scope": "email profile"
}

Get playlists:

curl --location 'http://localhost:8090/playlist' \
--header 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIwZFhCdGdMTTZIQ19pMkJ1QmV0RXNHTjF2Vmg1Qk1XYzFCZzRsUDVyNEh3In0.eyJleHAiOjE3Mjk3OTg1NTUsImlhdCI6MTcyOTc5ODI1NSwianRpIjoiNTMyMzBlYWEtYjMxOC00NTIzLWI3NjEtMDU5ZjljZTY0M2M5IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9EZW1vLVJlYWxtIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjJhMTg3MDI5LWQ0NDYtNDZkNi04NzAxLWJlZDE4Mjg2ODU2OCIsInR5cCI6IkJlYXJlciIsImF6cCI6InNwcmluZ2Jvb3QtbWljcm9zZXJ2aWNlIiwic2lkIjoiYzI0ZjM2NjktNjAyZS00YjkyLWFjNjQtMDhlMDQ0ZTBmNjZkIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwOi8vbG9jYWxob3N0OjgwOTAiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwiYXBwLWFkbWluIiwiZGVmYXVsdC1yb2xlcy1kZW1vLXJlYWxtIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJzcHJpbmdib290LW1pY3Jvc2VydmljZSI6eyJyb2xlcyI6WyJhZG1pbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsIm5hbWUiOiJ1c2VyMSB1c2VyMSIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIxIiwiZ2l2ZW5fbmFtZSI6InVzZXIxIiwiZmFtaWx5X25hbWUiOiJ1c2VyMSIsImVtYWlsIjoidXNlcjFAbXlhcHBsaWNhdGlvbi5jb20ifQ.iCmijvArThu7BKZd6oK8nEYtqR3VGzp1fIllP_Hxe28gD5-Um32hFPnKdTmrkmDhWjUTLNy7zLnTJTNBJGJMzDe6tvurfJi0xklTSR2py0AepqAG6ha333l7yV1bUiRSv63b5rOd4TUEnbap74cWB5jHNcyRT8KRpNB-ML4wX8n1PaUhgVFmUV92uZv_owucSQD1LwkDZmHWW4igWSSiJ0hY-ahetDK_TSiG-mR9J7EtDLX2lFv75HtYCubtLk5IfdMPYafu21adjCnhewBGgPpgahnifsdW7y4wYwOU_U6vHwadF1Db2bzv9GuJsNGCwQqq3kMfGgwEpBKVm3EEog'
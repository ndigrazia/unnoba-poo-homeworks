sudo docker run --name keycloak -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin -p 8180:8080 jboss/keycloak

https://medium.com/devops-dudes/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e

/bookings/*
users, admin


/bookings/rooms/* users
/bookings/orders/* users
/bookings/invoices/* users
/booking/config/* admin
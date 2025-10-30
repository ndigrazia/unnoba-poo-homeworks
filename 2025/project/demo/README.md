# Create an user
curl --location 'http://localhost:8090/participants' \
--header 'Content-Type: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Juan",
    "surname": "Perez",
    "email": "juan.perez@example.com",
    "password": "12345678"
}'

# Database
http://localhost:8090/h2-console
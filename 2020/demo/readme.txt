mysql -u root -p -h localhost

CREATE DATABASE bookstore;

USE bookstore;

CREATE TABLE User
(id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50),
password VARCHAR(50),
email VARCHAR(50),
role VARCHAR(50),
first_name VARCHAR(50),
last_name VARCHAR(50));

DESCRIBE User;

INSERT INTO User (username, email, password, role, first_name, last_name) VALUES ('unnoba', 'unnoba@unnoba.edu.ar', 'unnoba', 'USER', 'unnoba', 'unnoba');

https://mariadb.com/kb/en/mariadb-basics/
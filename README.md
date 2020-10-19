# Item REST API

##  Description

This project is an example for a simple REST API

The project is deployed on the port 8080 

```
http://localhost:8080/api/item
```

The database configuration 

```
spring:
  application:
    name: item
  datasource:
    url: jdbc:mysql://localhost:3306/database_name
    username: root    
    password: password
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    database-platform: org.hibernate.dialect.MySQL57Dialect
    generate-ddl: true

```
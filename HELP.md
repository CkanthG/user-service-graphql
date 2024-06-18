# User Service Spring Boot Application with GraphQL

### User Service GraphQL application clean and build
`` ./gradlew clean build``

### Generate User Service GraphQL Docker Image
 ```
 docker build -t user-service-graphql .
 ```

### Run User Service GraphQL Docker Image
```
docker run -p <host-port>:<container-port> user-service-graphql
```

### GraphQL URL
```http://localhost:8081/graphiql?path=/graphql```

# user-service

## 1. Application purpose
Simple REST API providing user data for a CI/CD learning lab. Uses
in-memory sample data (no database).

## 2. Technology
- Java
- Spring Boot
- Maven

## 3. Local setup
```bash
mvn spring-boot:run
```
Endpoints:
- `GET /users`
- `GET /users/{id}`
- `POST /users`

## 4. Test command
```bash
mvn test
```

## 5. Build command
```bash
mvn package
```

## 6. Docker build command
```bash
docker build -t user-service .
```

## 7. Docker run command
```bash
docker run -p 8081:8081 user-service
```

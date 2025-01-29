FROM maven:3.9.5-eclipse-temurin-21 AS build
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn clean install

FROM eclipse-temurin:21
COPY --from=build /app/target/Calculadora-1.0-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]
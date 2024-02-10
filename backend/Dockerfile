FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app/backend
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

FROM openjdk:17-jdk
COPY --from=build /app/backend/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]

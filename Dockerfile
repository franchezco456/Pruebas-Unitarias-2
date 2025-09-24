FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn -B package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/Test-Unitarios-2-1.0-SNAPSHOT.jar Main.jar
CMD ["java", "-jar", "Main.jar"]

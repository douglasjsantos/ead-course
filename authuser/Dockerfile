# Usar a imagem base do Maven para construir o projeto
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Usar uma imagem mais leve do Java para rodar a aplicação
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/ead-authuser-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "app.jar"]

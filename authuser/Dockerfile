# Use uma imagem base do JDK para construir o projeto
FROM maven:3.8.4-openjdk-17-slim AS build

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo pom.xml e instale as dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copie o código-fonte do projeto
COPY src ./src

# Compila a aplicação
RUN mvn clean package -DskipTests

# Imagem final para rodar o aplicativo
FROM openjdk:17-jdk-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR da fase de build anterior
COPY --from=build /app/target/ead-course-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8087 para acessar a aplicação
EXPOSE 8087

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

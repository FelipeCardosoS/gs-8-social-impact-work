FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=target/gs-8-social-impact-work-0.0.1-SNAPSHOT.jar

WORKDIR /app

COPY ${JAR_FILE} app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]

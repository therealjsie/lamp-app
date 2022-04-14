FROM openjdk:11-jre-slim

WORKDIR /application

ADD target/lamp-service.jar /application/lamp-service.jar

ENTRYPOINT ["java", "-jar", "lamp-service.jar", "server", "config.yml"]

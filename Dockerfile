FROM openjdk:8u121-jre-alpine

WORKDIR /application

ADD target/lamp-service.jar /application/lamp-service.jar

ENTRYPOINT ["java", "-jar", "lamp-service.jar", "server", "config.yml"]

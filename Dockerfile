FROM openjdk:8u121-jre-alpine

WORKDIR /application

ADD target/lamp-service.jar /application/lamp-service.jar
ADD config-docker.yml /var/dropwizard-rest-stub/config.yml

ENTRYPOINT ["java", "-jar", "lamp-service.jar", "server", "config.yml"]

FROM openjdk:12-jdk-alpine

LABEL maintainer="contact@the224.dev"

VOLUME /orbital

ARG JAR_FILE=target/orbital-0.0.1.jar

COPY ${JAR_FILE} app.jar

EXPOSE 80

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
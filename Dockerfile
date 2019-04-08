##
# Orbital Docker Image
###

# Step 1: build #
FROM maven:3-jdk-12-alpine AS builder

WORKDIR /source-code

COPY pom.xml /source-code/

# ## Download source before detecting source code changes
# RUN mvn install

COPY . /source-code/

RUN mvn package

RUN cp /source-code/target/*.jar ./app.jar

# Step 2: Serve App #
FROM openjdk:12-jdk-alpine AS deployer

WORKDIR /orbital

COPY --from=builder ./source-code/app.jar ./app.jar

# RUN mkdir static

EXPOSE 80

LABEL maintainer="contact@the224.dev"

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/orbital/app.jar"]
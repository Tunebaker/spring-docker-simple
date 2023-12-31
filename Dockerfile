FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8090
ARG JAR_FILE=target/spring-docker-simple-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

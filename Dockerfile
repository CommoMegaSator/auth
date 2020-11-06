FROM openjdk:11-jre-slim
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} auth-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/auth-0.0.1-SNAPSHOT.jar"]

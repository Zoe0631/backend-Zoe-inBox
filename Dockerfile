FROM openjdk:11-jdk
ARG jar=./build/libs/app.jar
COPY ${jar} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
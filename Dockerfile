FROM openjdk:19
ADD ./target/task-service-0.0.1.jar task-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/task-service-0.0.1.jar"]
EXPOSE 8080
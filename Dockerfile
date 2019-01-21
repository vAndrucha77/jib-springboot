FROM openjdk:8u111-jdk-alpine
ADD target/*.jar /usr/app/app.jar  
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/app.jar"] 
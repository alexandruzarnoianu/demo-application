FROM openjdk:21
MAINTAINER alexandruzarnoianu
COPY target/demo-application-0.0.1-SNAPSHOT.jar demo-application-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/demo-application-0.0.1-SNAPSHOT.jar"]
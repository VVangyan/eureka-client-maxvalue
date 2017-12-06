FROM ubuntu:latest
VOLUME /tmp
ADD target/eureka-client-maxvalue.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
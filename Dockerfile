FROM amazoncorretto:20
MAINTAINER analiafritzler
COPY target/proyectoap-0.0.1-SNAPSHOT.jar proyectoap-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/proyectoap-0.0.1-SNAPSHOT.jar"]
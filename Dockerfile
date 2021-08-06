FROM maven:3.6.1

ADD pom.xml /tmp/build/

RUN cd /tmp/build && mvn -q dependency:resolve

ADD src /tmp/build/src

RUN cd /tmp/build && mvn -q -DskipTests=true package && mv target/*.jar /app.jar

VOLUME /tmp

EXPOSE 8888

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
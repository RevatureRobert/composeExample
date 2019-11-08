
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/Movies-Configuration-Server-0.0.1-SNAPSHOT.jar movies-configuration-server.jar
EXPOSE 9090
# ENTRYPOINT exec java $JAVA_OPTS -jar movies-configuration-server.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar movies-configuration-server.jar

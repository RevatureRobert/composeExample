
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/Movies-Gateway-0.0.1-SNAPSHOT.jar movies-gateway.jar
EXPOSE 8765
# ENTRYPOINT exec java $JAVA_OPTS -jar movies-gateway.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar movies-gateway.jar


FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/Movies-Romance-0.0.1-SNAPSHOT.jar movies-romance.jar
EXPOSE 9001
# ENTRYPOINT exec java $JAVA_OPTS -jar movies-romance.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar movies-romance.jar

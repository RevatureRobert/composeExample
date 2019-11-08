
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD 07-microservices.jar 07-microservices.jar
EXPOSE 9000
EXPOSE 9001
EXPOSE 9002
EXPOSE 9090
EXPOSE 9091
EXPOSE 9061
EXPOSE 8765
EXPOSE 8761
ENTRYPOINT exec java $JAVA_OPTS -jar 07-microservices.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar 07-microservices.jar

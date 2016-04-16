FROM java:8-jre
MAINTAINER Artem Avdosev <artem.avdosev@gmail.com>

ADD ./gateway.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]

EXPOSE 8080
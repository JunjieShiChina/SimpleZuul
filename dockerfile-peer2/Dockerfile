FROM java:8
MAINTAINER junjieshi
ADD SimpleZuul.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8769
ENTRYPOINT ["java", "-jar","/app.jar","peer2"]
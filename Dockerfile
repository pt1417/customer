FROM anapsix/alpine-java:latest 
COPY target/Customer-0.0.1-SNAPSHOT.jar app.jar 
EXPOSE 8085
ENTRYPOINT java -jar ./app.jar
FROM openjdk:20-ea-27-jdk-slim-buster

WORKDIR /app

COPY target/products-1.0.jar products-api.jar
RUN chmod -R 777 /app

ENTRYPOINT ["java", "-jar", "products-api.jar"]
FROM eclipse-temurin:17-alpine

WORKDIR /app

COPY target/ecommerce-back-end-1.0.0.jar ecommerce-back-end-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "ecommerce-back-end-1.0.0.jar"]
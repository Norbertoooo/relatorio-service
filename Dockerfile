FROM eclipse-temurin:17-jdk-alpine
COPY target/relatorio-service-*.jar relatorio-service.jar
CMD ["java", "-jar", "relatorio-service.jar"]
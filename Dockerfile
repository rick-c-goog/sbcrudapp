FROM eclipse-temurin:17 as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

FROM gcr.io/distroless/java17-debian11
COPY --from=builder /app.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
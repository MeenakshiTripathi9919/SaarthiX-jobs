# Use official Java 17 runtime
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy Gradle files
COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Pre-download dependencies (to improve caching)
RUN ./gradlew build -x test --no-daemon || return 0

# Copy the actual source code
COPY src src

# Build the Spring Boot jar
RUN ./gradlew clean bootJar --no-daemon

# Copy the built JAR into the container (matches your filename)
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]

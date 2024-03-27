FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY build/libs/*.jar app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

#docker build -t cms_app .
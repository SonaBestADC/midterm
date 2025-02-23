# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged application JAR file
COPY target/*.jar /app/app.jar

# Define the entry point
CMD ["java", "-jar", "/app/app.jar"]


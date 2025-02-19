# Use an official OpenJDK runtime as a base image
FROM openjdk:23-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy build output (compiled classes, resources, and config)
COPY target/classes/ /app/classes


# Set the classpath and define the entry point
CMD ["java", "-cp", "/app/classes", "org.example.App"]

# WeatherDemo
Demo Application to get basic Weather Information of given City

# Git Repository
git clone https://github.com/prajapativijay/WeatherDemo.git

cd WeatherDemo

# Build an executable JAR
 you can build the JAR file with mvn clean package 

# Run Jar 
java -jar weather-app-0.0.1-SNAPSHOT.jar

This is a Spring Boot application which contains tomcat as a embeded server.

# Access WeatherDemo Application
http://localhost:8080

This application defaults to run on port 8080. By adding an application.properties file, you can override that setting.
src/main/resources/application.properties
server.port: 9000

# Access RESTFul Services
http://localhost:8080/weather/{city}

#TODO: Validation needs to be implement.
#TODO: Handle failure scenarios.
#TODO: Apply Design pattern to make it scalable.

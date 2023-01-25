Build application
mvn clean install

Run application
mvn spring-boot:run

Cigwin Command
List one curl --location --request GET 'localhost:8080/get/students'

Map one curl --location --request GET 'localhost:8080/map/students'


Docker Command
Building
Maven $ mvn clean install

Dockerization
$ mvn install dockerfile:build

List docker images
$ docker images

Running the application in docker container
$ docker run -p 8080:8080 kmr09/student:0.0.1-SNAPSHOT

List docker running container
$ docker ps
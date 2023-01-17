## Spring Controller
first use https://start.spring.io/ for creating maven project


## Copy the folder in day04
## Delete unnecessary files 
## Open only spring-controller folder 
## Build project using cmd : 
``````
mvn clean install
``````
## Start project using cmd : mvn spring-boot:run

## Open the port using localhost address in browser and postman
   # localhost:8080/hello 
   # localhost:8080/request/hello

## Test Application

     curl --location --request GET 'localhost:8081/welcome?name=Adesh'
     curl --location --request GET 'localhost:8081/send/hi'

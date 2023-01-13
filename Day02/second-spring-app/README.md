## Create Springboot project
https://start.spring.io/

project: maven
language: java
version : 2.7.7

Project Metadata
Group: com._.app
artifact: com._.app
name: second-spring-app
java:11


and add spring web dependencies

commands:

##Build project 
  mvn clean install

##run the application
  mvn spring-boot:run
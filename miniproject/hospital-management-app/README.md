**Hospital Management App**

**Build the project**

mvn clean install

**Docker image creation**

mvn install dockerfile:build

**Run the project using docker commands**

cd docker
docker-compose up -d
cd..
mvn spring-boot:run
docker-compose down

**Controller**

**Doctor COntroller**

curl --location --request GET 'localhost:8080/doctor/doctor-appointment?doctorName=Sahil' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''


curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=B7E6821D388DCC56BEEA5BDB49700E17' \
````````
--data-raw '{
"appointmentId": "01",
"patientName": "pat01",
"doctorName": "Sahil",
"date": "9th dec",
"prescription": {
"prescriptionId": "pre01",
"appointmentId": "app01",
"description": "drugs for malaria",
"patientName": "Rajesh1",
"doctorName":"Sahil"
}
}'
````````



**Patient Controller**

curl --location --request GET 'localhost:8080/patient/myappointment?patientName=vijay' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \

``````````
--data-raw '{
"appointmentId": "app03",
"patientName": "vijay",
"doctorName": "Sahil",
"date": "7th feb",
"prescription": {
"prescriptionId": "pre03",
"appointmentId": "app03",
"description": "cold",
"patientName": "vijay",
"doctorName": "sahil"
}
}'
````````




**Prescription Controller**

curl --location --request GET 'localhost:8080/patient/myappointment?patientName=vijay' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \

````
--data-raw '{
"prescriptionId": "pre03",
"appointmentId": "app03",
"description": "bp",
"patientName": "vijay",
"doctorName": "Sahil"
}'
````


**Docker Commands**

docker ps -a

docker stop <CONTAINER_ID>

docker rm <CONTAINER_ID>

docker rmi <IMAGE_ID>


**Swagger**

http://localhost:8080/swagger-ui-/index.html
Credentials
ROLE :DOCTOR---> Username & Password : doctor  & doctor
ROLE :PATIENT--> Username & Password : patient & pstient

**Hospital Management App**
**Create Springboot Project**
https://start.spring.io/

**Build the Project**
mvn clean install

**Docker image Creation**
mvn install dockerfile:build

**Run the Project**
cd docker
docker-compose up -d
cd..
mvn spring-boot:run
docker-compose down

**Testing
Doctor Controller**
curl --location --request GET 'localhost:8080/doctor/doctor-appointment?doctorName=Sahil' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''


curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=B7E6821D388DCC56BEEA5BDB49700E17' \
--data-raw '{
"appointmentId": "0001",
"patientName": "pat0001",
"doctorName": "Sahil",
"date": "9th dec",
"prescription": {
"prescriptionId": "pre0001",
"appointmentId": "app0001",
"description": "drugs for malaria",
"patientName": "Rajesh1",
"doctorName":"Sahil"
}
}'
Patient Controller
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=rakesh' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw '{
"appointmentId": "app0003",
"patientName": "vijay",
"doctorName": "Sahil",
"date": "7th feb",
"prescription": {
"prescriptionId": "pre0003",
"appointmentId": "app0003",
"description": "cold",
"patientName": "vijay",
"doctorName": "sahil"
}
}'

Prescription Controller
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=vijay' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw '{
"prescriptionId": "pre0003",
"appointmentId": "app0003",
"description": "bp",
"patientName": "vijay",
"doctorName": "Sahil"
}'

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

**Hospital Management App**

Create 3 packages in com.adesh.app such as controller, model, repository.
In 'controller' create 3 controller classes DoctorController, PatientController, PrescriptionController.
In 'model' 2 classes Appointment and Prescription
In 'repository' 2 repository classes of AppointmentRepository and PrescriptionRepository


**Spring boot application**
https://start.spring.io

**Run the application**
mvn clean install

**Build the application**
mvn spring-boot:run

**Docker Compose**

docker-compose -f docker-compose-mongo.yml up -d
docker-compose -f docker-compose-mongo.yml down
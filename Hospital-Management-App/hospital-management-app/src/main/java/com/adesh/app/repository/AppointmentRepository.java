package com.adesh.app.repository;


import com.adesh.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class AppointmentRepository extends MongoRepository<Appointment, String> {
    public  Appointment save(Appointment appointment);
    public  List<Appointment> findByDoctorName(String doctorName);
    public  List<Appointment> findByPatientName(String patientName);
}

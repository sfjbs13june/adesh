package com.adesh.app.repository;

import com.adesh.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    public List<Appointment> findByDoctorName(String doctorName);
    public Appointment save(Appointment appointment);
    public List<Appointment> findByPatientName(String patientName);
}

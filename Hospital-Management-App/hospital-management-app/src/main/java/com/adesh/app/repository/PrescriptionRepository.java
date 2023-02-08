package com.adesh.app.repository;

import com.adesh.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrescriptionRepository extends MongoRepository<Prescription, String> {

    public Prescription save(Prescription prescription);


    public List<Prescription> findAllByPatientName(String patientName);
}

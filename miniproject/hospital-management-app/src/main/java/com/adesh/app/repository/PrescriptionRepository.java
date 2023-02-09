package com.adesh.app.repository;

import com.adesh.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Repository

public abstract class PrescriptionRepository implements MongoRepository<T, Event.ID> {

    public Prescription save(Prescription prescription) {

        return null;
    }

    public List<Prescription> findAllByPatientName(String patientName) {

        return null;
    }


    public List<Prescription> findByPatientName(String patientName) {

        return null;
    }
}

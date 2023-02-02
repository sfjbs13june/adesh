package com.adesh.app.repository;

import com.adesh.app.model.Patient;
//import org.springframework.data.mongodb.repository.MongoDBRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
interface PatientRespository extends MongoRepository<Patient, String> {

    public Patient findByName(String name);

    public Patient save(Patient patient);


    List<Patient> findAll();
}

package com.adesh.db.repository;

import com.adesh.db.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patients, Integer> {
}
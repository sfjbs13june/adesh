package com.adesh.app.controller;
import com.adesh.app.model.Patient;
import com.adesh.app.repository.PatientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    PatientRespository patientRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        patient = patientRepository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Patient> readStudent() {
        return patientRepository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Patient readByNamePatient(@PathVariable("name") String name) {
        return patientRepository.findByName(name);
    }
}




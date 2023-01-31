package com.adesh.db.controller;

import com.adesh.db.model.Patients;
import com.adesh.db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Patients> getAll() {
        return patientRepository.findAll();
    }

    @PostMapping(value = "/save")
    public @ResponseBody
    String store(@RequestBody final Patients patients) {
        patientRepository.save(patients);
        return "saved";
    }

    /*@DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
        patientRepository.deleteById(id);
        return "deleted";
    }*/
}


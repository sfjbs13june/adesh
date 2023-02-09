package com.adesh.app.controller;


import com.adesh.app.model.Prescription;
import com.adesh.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;

    @RequestMapping(value = "/view-prescription", method = RequestMethod.GET)
    public List<Prescription> getAllPrescription(@RequestParam String patientName){
        return prescriptionRepository.findByPatientName(patientName);
    }

    @RequestMapping(value = "/save-prescription", method = RequestMethod.POST)
    public Prescription savePrescription(@RequestBody Prescription prescription){
        return prescription;
    }
}

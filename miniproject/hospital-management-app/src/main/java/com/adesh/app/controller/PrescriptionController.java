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

    @GetMapping("/view-prescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
        return prescriptionRepository.findByPatientName(patientName);
    }

    @PostMapping("/save-prescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        return prescription;
    }


}

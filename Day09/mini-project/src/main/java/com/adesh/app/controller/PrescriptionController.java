package com.adesh.app.controller;

import com.adesh.app.model.Appointment;
import com.adesh.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class PrescriptionController {
    Prescription prescription1 = new Prescription("p01","a01","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p02","a02","cold","pat2","doc2");
    @GetMapping("/viewprescription")
    public List<Appointment> getPrescriptions(){
        List listprescriptions = new ArrayList();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","25-01-2023",prescription2);
        listprescriptions.add(prescription1.getDescription());
        listprescriptions.add(prescription2.getDescription());
        return listprescriptions;

    }
    @PostMapping("/saveprescription")
    public Map mapprescriptions() {
        Map Mapprescription = new HashMap();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","25-01-2023",prescription2);
        Mapprescription.put(prescription1.getDescription(), appointment1);
        Mapprescription.put(prescription2.getDescription(),appointment2);
        return Mapprescription;

    }
}

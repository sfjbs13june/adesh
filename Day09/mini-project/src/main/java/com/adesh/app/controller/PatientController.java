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
public class PatientController {
    Prescription prescription1 = new Prescription("p01","a01","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p02","a02","cold","pat2","doc2");
    @GetMapping("/patient")
    public List<Appointment> getPatients(){
        List listpatients= new ArrayList();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc1","25-01-2023",prescription2);
        listpatients.add(appointment1.getPatientName());
        listpatients.add(appointment2.getPatientName());
        return listpatients;

    }
    @PostMapping("/myappointment")
    public Map mapPatient1() {
        Map MapPatient1 = new HashMap();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc2","25-01-2023",prescription2);
        MapPatient1.put(appointment1.getPatientName(), appointment1);
        MapPatient1.put(appointment2.getPatientName(),appointment2);
        return MapPatient1;

    }
}


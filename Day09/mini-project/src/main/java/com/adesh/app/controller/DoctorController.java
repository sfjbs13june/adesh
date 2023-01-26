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
public class DoctorController {
    Prescription prescription1 = new Prescription("p01","a01","fever","pat1","doc1");
    Prescription prescription2 = new Prescription("p02","a02","cold","pat2","doc2");
    @GetMapping("/doctorappointment")
    public List<Appointment> getDoctors(){
        List listdoctors= new ArrayList();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc2","25-01-2023",prescription2);
        listdoctors.add(appointment1.getDoctorName());
        listdoctors.add(appointment2.getDoctorName());
        return listdoctors;

    }
    @PostMapping("/save")
    public Map mapdoctors() {
        Map Mapdoctors = new HashMap();
        Appointment appointment1 = new Appointment("1", "pat1", "doc1", "25-01-2023", prescription1);
        Appointment appointment2 = new Appointment("2","pat2","doc2","25-01-2023",prescription2);
        Mapdoctors.put(appointment1.getDoctorName(), appointment1);
        Mapdoctors.put(appointment2.getDoctorName(),appointment2);
        return Mapdoctors;

    }



}



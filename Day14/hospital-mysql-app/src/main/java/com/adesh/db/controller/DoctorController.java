package com.adesh.db.controller;

import com.adesh.db.model.Appointment;
import com.adesh.db.model.Prescription;
import com.adesh.db.repository.AppointmentRepository;
import com.adesh.db.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping(value = "/doctorappointment")
    public @ResponseBody
    Iterable<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @PostMapping(value = "/save")
    public @ResponseBody
    String store(@RequestBody final Appointment appointment) {
        appointmentRepository.save(appointment);
        return "saved";
    }
}
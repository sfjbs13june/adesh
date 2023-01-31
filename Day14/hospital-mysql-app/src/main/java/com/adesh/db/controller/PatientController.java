package com.adesh.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping(value = "/myappointment")
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

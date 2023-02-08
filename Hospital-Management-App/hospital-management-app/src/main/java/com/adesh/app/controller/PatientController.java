package com.adesh.app.controller;


import com.adesh.app.model.Appointment;
import com.adesh.app.repository.AppointmentRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName){
        return appointmentRepository.findByPatientName(patientName);
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        appointment = appointmentRepository.save(appointment);
    }
}

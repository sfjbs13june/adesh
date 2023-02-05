package com.adesh.app.controller;

import com.adesh.app.model.Hospital;
import com.adesh.app.model.Patient;
import com.adesh.app.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class HospitalController {
    @Autowired
    RabbitMQSender rabbitMQSender;


    @PostMapping(value = "/hospital")
    public Hospital postHospital(@RequestBody Hospital hospital) {
        rabbitMQSender.sendHospital(hospital);
        System.out.println("Message sent to the RabbitMQ Successfully");
        return hospital;
    }

    @PostMapping(value = "/patient")
    public Patient postPatient(@RequestBody Patient patient) {

        rabbitMQSender.sendPatient(patient);
        System.out.println("Message sent to the RabbitMQ Successfully");
        return patient;
    }
}

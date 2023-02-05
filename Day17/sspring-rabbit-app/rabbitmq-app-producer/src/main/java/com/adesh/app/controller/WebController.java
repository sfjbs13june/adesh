package com.adesh.app.controller;

import com.adesh.app.model.Employee;
import com.adesh.app.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class WebController {
    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

        Employee emp=new Employee();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        rabbitMQSender.send(emp);

        return "Message sent to the RabbitMQ  Successfully";
    }

    @PostMapping(value = "/employee")
    public String postEmployee(@RequestBody Employee employee) {

        rabbitMQSender.send(employee);

        return "Message sent to the RabbitMQ  Successfully";
    }
}


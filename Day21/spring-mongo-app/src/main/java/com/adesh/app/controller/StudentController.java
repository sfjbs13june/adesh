package com.adesh.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Student create(@RequestBody Student student) {
        student = studentRepository.save(student);
        return student;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Student> readStudent() {
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Student readByNameStudent(@PathVariable("name") String name) {
        return studentRepository.findByName(name);
    }
}


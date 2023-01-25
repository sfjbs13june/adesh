package com.adesh.app.controller;

import com.adesh.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> gettingStudent()
    {
        List listStudent = new ArrayList();
        Student student1 = new Student("1","Adesh","12","Central Academy");
        Student student2 = new Student("2","Vijay","11","Shirdi Sai");
        Student student3 = new Student("3","Ajay","10","Adarsh");


        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);

        return listStudent;
    }

    @GetMapping("/map/students")
    public Map GettingMapStudent()
    {
        Map studentMap = new HashMap();
        Student student1 = new Student("1","Adesh","12","Central Academy");
        Student student2 = new Student("2","Vijay","11","Shirdi Sai");
        Student student3 = new Student("3","Ajay","10","Adarsh");

        studentMap.put(student1.getRollno(),student1);
        studentMap.put(student2.getRollno(),student2);
        studentMap.put(student3.getRollno(),student3);
        return studentMap;
    }

}



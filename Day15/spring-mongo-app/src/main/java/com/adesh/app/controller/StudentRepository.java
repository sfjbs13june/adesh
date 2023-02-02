package com.adesh.app.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentRespository extends MongoRepository<Student, String> {

    public Student findByName(String name);

    public Student save(Student student);

}

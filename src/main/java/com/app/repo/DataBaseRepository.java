package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.Student;

public interface DataBaseRepository extends MongoRepository<Student, String> {

}

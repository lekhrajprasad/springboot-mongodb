package com.assignment.springboot.mongo.dao;

import com.assignment.springboot.mongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {
}

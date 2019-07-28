package com.assignment.springboot.mongo.controller;

import com.assignment.springboot.mongo.model.Employee;
import com.assignment.springboot.mongo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value= "/api/mongo/emp")
public class EmployeeController {
    @Autowired
    EmployeeService serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Method to save employees in the db.
     * @param emp
     * @return
     */
    @PostMapping(value= "/create")
    public String create(@RequestBody List<Employee> emp) {
        logger.debug("Saving employees.");
        serv.createEmployee(emp);
        return "Employee records created.";
    }

    /**
     * Method to fetch all employees from the db.
     * @return
     */
    @GetMapping(value= "/getall")
    public Collection<Employee> getAll() {
        logger.debug("Getting all employees.");
        return serv.getAllEmployees();
    }
}

package com.resttraining.springboot.employees.controller;

import com.resttraining.springboot.employees.dao.EmployeDAO;
import com.resttraining.springboot.employees.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    private EmployeDAO employeDAO;

    @Autowired
    public EmployeeRestController(EmployeDAO employeDAO) {
        this.employeDAO = employeDAO;
    }

    /**
     * Endpoint to retrieve all employees.
     *
     * @return List of all employees
     */
    @GetMapping
    public List<Employee> listEmployees() {
        return employeDAO.findAll();
    }

}

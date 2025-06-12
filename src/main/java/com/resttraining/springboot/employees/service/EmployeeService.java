package com.resttraining.springboot.employees.service;


import com.resttraining.springboot.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}

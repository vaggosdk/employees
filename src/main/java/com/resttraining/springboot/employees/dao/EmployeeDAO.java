package com.resttraining.springboot.employees.dao;

import com.resttraining.springboot.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(long theId);

    Employee save (Employee theEmployee);

    void deleteById(long theId);
}

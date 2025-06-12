package com.resttraining.springboot.employees.dao;

import com.resttraining.springboot.employees.entity.Employee;

import java.util.List;

public interface EmployeDAO {

    List<Employee> findAll();
}

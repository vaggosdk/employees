package com.resttraining.springboot.employees.dao;

import com.resttraining.springboot.employees.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // Create a query to retrieve all employees
        return entityManager.createQuery("FROM Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(long theId) {
        return entityManager.find(Employee.class, theId);
    }

    @Override
    public Employee save(Employee theEmployee) {
        return entityManager.merge(theEmployee);
    }

    @Override
    public void deleteById(long theId) {
        Employee employee = entityManager.find(Employee.class, theId);
        entityManager.remove(employee);
    }
}

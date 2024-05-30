package com.restproject.springboot.crudrestdemo.dao;

import java.util.List;

import com.restproject.springboot.crudrestdemo.model.Employee;

public interface EmployeeDAO {
    // list of api's methods
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}

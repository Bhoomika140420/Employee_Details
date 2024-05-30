package com.restproject.springboot.crudrestdemo.service;

import java.util.List;

import com.restproject.springboot.crudrestdemo.model.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}

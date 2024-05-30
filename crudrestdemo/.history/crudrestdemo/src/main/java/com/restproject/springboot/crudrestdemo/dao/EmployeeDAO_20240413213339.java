package com.restproject.springboot.crudrestdemo.dao;

import com.restproject.springboot.crudrestdemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);
    Employee save (Employee theEmployee);

    void deleteById(int theId);

}

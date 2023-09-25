package com.example.springbootdemo.Service;

import com.example.springbootdemo.Model.Employee;

import java.util.List;

public interface EmployeeService{
    public Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmmployeeById(String id);

    String deleteeEmployeeById(String id);
}

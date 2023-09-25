package com.example.springbootdemo.Service;

import com.example.springbootdemo.Model.Employee;
import com.example.springbootdemo.error.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImp implements EmployeeService{
    List<Employee> employees=new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployeeId()==null || employee.getEmailId().isEmpty())
            employee.setEmployeeId(UUID.randomUUID().toString());
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

//    @Override
//    public Employee getEmmployeeById(String id) {
//        return employees.stream().filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id)).
//                findFirst().orElseThrow(()-> new EmployeeNotFoundException("employee not found with id:" + id));
//    }
    @Override
    public Employee getEmmployeeById(String id) {
        return employees.stream().filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id)).
                findFirst().orElseThrow(()-> new RuntimeException("employee not found with id:" + id));
    }

    @Override
    public String deleteeEmployeeById(String id) {
        Employee employee=employees.stream().filter(e -> e.getEmployeeId().equalsIgnoreCase(id)).findFirst().
                get();
        employees.remove(employee);
        return "Employee deleted with the id:" + id;
    }
}

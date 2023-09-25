package com.example.springbootdemo.Controller;

import com.example.springbootdemo.Model.Employee;
import com.example.springbootdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {
    @Autowired
    @Qualifier("employeeServiceImp")
    EmployeeService employeeService;
    @PostMapping
    public Employee save(@RequestBody Employee employee){
    return  employeeService.save(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService .getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmmployeeById(@PathVariable String id){
        return employeeService.getEmmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteeEmployeeById(@PathVariable String id){
        return employeeService.deleteeEmployeeById(id);
    }
}

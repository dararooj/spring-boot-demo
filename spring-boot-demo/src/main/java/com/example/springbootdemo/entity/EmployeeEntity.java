package com.example.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class EmployeeEntity {
    @Id
    private  String employeeId;
    private  String firstname;
    private  String lastname;
    private  String emailId;
    private  String Department;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String employeeId, String firstname, String lastname, String emailId, String department) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailId = emailId;
        Department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}

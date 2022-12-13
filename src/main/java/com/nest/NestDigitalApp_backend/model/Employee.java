package com.nest.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue

    private int id;
    private String empcode;
    private String empname;
    private String designation;
    private String salary;
    private String mail;
    private String phone;
    private String empusername;
    private String emppassword;

    public Employee(){}

    public Employee(int id, String empcode, String empname, String designation, String salary, String mail, String phone, String empusername, String emppassword) {
        this.id = id;
        this.empcode = empcode;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.mail = mail;
        this.phone = phone;
        this.empusername = empusername;
        this.emppassword = emppassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmpusername() {
        return empusername;
    }

    public void setEmpusername(String empusername) {
        this.empusername = empusername;
    }

    public String getEmppassword() {
        return emppassword;
    }

    public void setEmppassword(String emppassword) {
        this.emppassword = emppassword;
    }
}

package com.nest.NestDigitalApp_backend.controller;

import com.nest.NestDigitalApp_backend.dao.EmployeeDao;
import com.nest.NestDigitalApp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao empdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employee emp) {
        System.out.println(emp.getEmpcode().toString());
        System.out.println(emp.getEmpname().toString());
        System.out.println(emp.getDesignation().toString());
        System.out.println(emp.getSalary().toString());
        System.out.println(emp.getPhone().toString());
        System.out.println(emp.getMail().toString());
        System.out.println(emp.getEmpusername().toString());
        System.out.println(emp.getEmppassword().toString());

        empdao.save(emp);
        return "Employee Added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewemployee")
    public List<Employee> ViewEmployee() {
        return (List<Employee>) empdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path= "/deleteemployee", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> DeleteEmployee(@RequestBody Employee emp) {

        String empid = String.valueOf(emp.getId());
        System.out.println(empid);
        empdao.deleteEmployee(emp.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchemployee", consumes = "application/json", produces = "application/json")
    public List<Employee> SearchEmployee(@RequestBody Employee e){
        String empcode = String.valueOf(e.getEmpcode()) ;
        System.out.println(empcode);
        return (List<Employee>) empdao.SearchEmployee(e.getEmpcode());
    }
}

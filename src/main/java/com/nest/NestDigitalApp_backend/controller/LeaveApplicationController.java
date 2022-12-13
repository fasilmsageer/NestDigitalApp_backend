package com.nest.NestDigitalApp_backend.controller;

import com.nest.NestDigitalApp_backend.dao.LeaveApplicationDao;
import com.nest.NestDigitalApp_backend.model.LeaveApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class LeaveApplicationController {
    @Autowired
    public LeaveApplicationDao lapdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/leaveapply",produces = "application/json",consumes = "application/json")
    public Map<String,String> ApplyLeave(@RequestBody LeaveApplication lap) {
        lapdao.save(lap);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewleave")
    public List<Map<String,String>> ViewAllLeaveByEmpcode()
    {
        return (List<Map<String, String>>) lapdao.ViewAllLeave();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/update",consumes = "application/json",produces = "application/json")
    public Map<String,String> UpdateStatus(@RequestBody LeaveApplication lap)
    {
        String empcode=String.valueOf(lap.getEmpcode());
        String status=lap.getStatus().toString();
        System.out.println(empcode);
        System.out.println(status);
        lapdao.UpdateStatus(lap.getEmpcode(),lap.getStatus());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leavebyid",consumes = "application/json",produces = "application/json")
    public String LeaveById(){
        return "leave by id";
    }
}

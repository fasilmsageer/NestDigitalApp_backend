package com.nest.NestDigitalApp_backend.controller;


import com.nest.NestDigitalApp_backend.dao.SecurityDao;
import com.nest.NestDigitalApp_backend.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class SecurityController {

    @Autowired
    private SecurityDao secdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity", consumes = "application/json", produces = "application/json")
    public String AddSecurity(@RequestBody Security sec) {
        System.out.println(sec.getSeccode().toString());
        System.out.println(sec.getSecname().toString());
        System.out.println(sec.getPhone().toString());
        System.out.println(sec.getSeccode().toString());
        System.out.println(sec.getSecusername().toString());
        System.out.println(sec.getSecpassword().toString());

        secdao.save(sec);
        return "Security Added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewsecurity")
    public List<Security> ViewSecurity() {
        return (List<Security>) secdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path= "/deletesecurity", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> DeleteSecurity(@RequestBody Security sec) {

        String secid = String.valueOf(sec.getId());
        System.out.println(secid);
        secdao.deleteSecurity(sec.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchsecurity", consumes = "application/json", produces = "application/json")
    public List<Security> SearchSecurity(@RequestBody Security sec){
        String seccode = String.valueOf(sec.getSeccode()) ;
        System.out.println(seccode);
        return (List<Security>) secdao.SearchSecurity(sec.getSeccode());
    }
}

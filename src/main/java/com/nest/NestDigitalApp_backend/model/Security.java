package com.nest.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "security")

public class Security {

    @Id
    @GeneratedValue

    private int id;
    private String seccode;
    private String secname;
    private String email;
    private String phone;
    private String secusername;
    private String secpassword;

    public Security(){}

    public Security(int id, String seccode, String secname, String email, String phone, String secusername, String secpassword) {
        this.id = id;
        this.seccode = seccode;
        this.secname = secname;
        this.email = email;
        this.phone = phone;
        this.secusername = secusername;
        this.secpassword = secpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccode() {
        return seccode;
    }

    public void setSeccode(String seccode) {
        this.seccode = seccode;
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecusername() {
        return secusername;
    }

    public void setSecusername(String secusername) {
        this.secusername = secusername;
    }

    public String getSecpassword() {
        return secpassword;
    }

    public void setSecpassword(String secpassword) {
        this.secpassword = secpassword;
    }
}

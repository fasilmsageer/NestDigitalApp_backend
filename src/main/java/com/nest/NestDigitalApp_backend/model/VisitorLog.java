package com.nest.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitorlog")



public class VisitorLog {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String purpose;
    private String whom_to_meet;
    private String date;
    private String entrytime;
    private String exittime;

}

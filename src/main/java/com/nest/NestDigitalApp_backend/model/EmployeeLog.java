package com.nest.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeelog")

public class EmployeeLog {

    @Id
    @GeneratedValue

    private int id;
    private int empid;
    private String date;
    private String entrytime;
    private String exittime;
}

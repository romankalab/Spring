package com.appslab.springbootapp.model;

public class Driver extends Employee {

    public Driver(float salary, int bonus) {
        super(salary, bonus, Employment.DRIVER);
    }
}

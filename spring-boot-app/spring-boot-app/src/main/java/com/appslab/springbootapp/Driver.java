package com.appslab.springbootapp;

import com.appslab.springbootapp.Employee;

public class Driver extends Employee {

    public Driver(float salary, int bonus) {
        super(salary, bonus, Employment.DRIVER);
    }
}

package com.appslab.springbootapp;

import com.appslab.springbootapp.Employee;

public class Teacher extends Employee {

    public Teacher(float salary, int bonus) {
        super(salary, bonus, Employment.TEACHER);
    }
}

package com.appslab.springbootapp.Employee;

public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, Employment.PROGRAMMER);
    }

    public void getInfo() {
        System.out.println(employment.job + "'s salary is " + (salary + bonus) + ".");
    }
}

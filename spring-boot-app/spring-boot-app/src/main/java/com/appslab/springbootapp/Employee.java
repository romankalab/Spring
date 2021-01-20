package com.appslab.springbootapp;

public class Employee {
    protected float salary;
    protected int bonus;
    protected enum Employment {
        PROGRAMMER("Programmer"),
        TEACHER("Teacher"),
        DRIVER("Driver");

        String job;
        Employment(String job) {
            this.job = job;
        }
    }
    Employment employment;

    public Employee(float salary, int bonus, Employment employment) {
        this.salary = salary;
        this.bonus = bonus;
        this.employment = employment;
    }

    public void getInfo() {
        System.out.println(employment.job + "'s salary is " + salary + " and bonus is " + bonus + ".");
    }
    public double getSalary() {
        return salary;
    }
    public int getBonus() {
        return bonus;
    }
}

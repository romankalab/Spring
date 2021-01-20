package com.appslab.springbootapp;

import java.util.Arrays;
import java.util.List;

public class DependencyInjectionDemo {
    EmployeeService employeeService;

    public DependencyInjectionDemo(EmployeeService employeeService) {
        this.employeeService = employeeService;
        Programmer programmer = new Programmer(1254, 65);
        Teacher teacher = new Teacher(854, 36);
        Driver driver = new Driver(750, 41);
        List<Employee> employees = Arrays.asList(programmer, teacher, driver);
        System.out.println();
        System.out.println();
        for(Employee person : employees)
            {
                person.getInfo();
            }
        System.out.println("The summary of all salaries and bonuses is: " + getSum(employees));
    }


    float getSum(List<Employee> employees)
    {
        return (float) (employeeService.getTotalBonus(employees) + employeeService.getTotalSalary(employees));
    };
}

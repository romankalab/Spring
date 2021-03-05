package com.appslab.springbootapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class EmployeeController {
    EmployeeService employeeService;
    Programmer programmer = new Programmer(1254, 65);
    Teacher teacher = new Teacher(854, 36);
    Driver driver = new Driver(750, 41);
    List<Employee> employees = Arrays.asList(programmer, teacher, driver);

    public static int solving(int towerHeigth, int stairHeigth, int stairLength)
    {
        int solvedProblem = (towerHeigth / stairHeigth) * stairLength;
        return solvedProblem;
    }

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/hello")
    String hello() {
        return "Hello Spring Boot.";
    }
    @RequestMapping("/salary")
    double salary() {
        return employeeService.getTotalSalary(employees);}
    @RequestMapping("/bonus")
    double bonus() {
        return employeeService.getTotalBonus(employees);}
    @RequestMapping("/snail")
    int snail(int towerHeigth, int stairHeigth, int stairLength) {return solving(towerHeigth, stairHeigth, stairLength);}
}

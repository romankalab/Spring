package com.appslab.springbootapp.Employee;

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

    public static int solving(int towerHeight, int stairHeight, int stairLength)
    {
        return (towerHeight / stairHeight) * stairLength;
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
    int snail(int towerHeight, int stairHeight, int stairLength) {return solving(towerHeight, stairHeight, stairLength);}
}

package com.appslab.springbootapp;
import com.appslab.springbootapp.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class WriteNumberClass {
    EmployeeService employeeService;

    public WriteNumberClass(EmployeeService employeeService) {
        this.employeeService = employeeService;
        employeeService.writeNumber();
    }
}

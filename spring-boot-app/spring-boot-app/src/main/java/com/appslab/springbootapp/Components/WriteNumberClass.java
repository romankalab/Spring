package com.appslab.springbootapp.Components;
import com.appslab.springbootapp.Employee.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class WriteNumberClass {
    EmployeeService employeeService;

    public WriteNumberClass(EmployeeService employeeService) {
        this.employeeService = employeeService;
        employeeService.writeNumber();
    }
}

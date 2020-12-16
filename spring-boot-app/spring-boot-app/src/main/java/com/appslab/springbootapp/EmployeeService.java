package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    double getTotalSalary(List<Employee> employments);
    int getTotalBonus(List<Employee> employments);
}

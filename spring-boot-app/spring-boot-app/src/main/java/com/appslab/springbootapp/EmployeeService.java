package com.appslab.springbootapp;

import java.util.List;

public interface EmployeeService {
    double getTotalSalary(List<Employee> employments);
    int getTotalBonus(List<Employee> employments);
}

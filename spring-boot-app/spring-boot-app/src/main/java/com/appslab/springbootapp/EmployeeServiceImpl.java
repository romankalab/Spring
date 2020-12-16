package com.appslab.springbootapp;


import com.appslab.springbootapp.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public double getTotalSalary(List<Employee> employments) {
        return (employments.stream().mapToDouble(Employee::getSalary).sum());
    }
    @Override
    public int getTotalBonus(List<Employee> employments) {
        return (employments.stream().mapToInt(Employee::getBonus).sum());
    }
}

package com.appslab.springbootapp.Employee;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;
    @Override
    public void writeNumber()
    {
        this.number += 1;
        System.out.println(this.number);
    }
    @Override
    public double getTotalSalary(List<Employee> employments) {
        return (employments.stream().mapToDouble(Employee::getSalary).sum());
    }
    @Override
    public int getTotalBonus(List<Employee> employments) {
        return (employments.stream().mapToInt(Employee::getBonus).sum());
    }
}
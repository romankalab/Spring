package com.appslab.springbootapp.Employee;

import java.util.List;

public interface EmployeeService {
    void writeNumber();
    double getTotalSalary(List<Employee> employments);
    int getTotalBonus(List<Employee> employments);
}

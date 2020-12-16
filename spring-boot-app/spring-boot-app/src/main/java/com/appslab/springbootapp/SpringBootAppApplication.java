package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Driver;
import com.appslab.springbootapp.model.Teacher;
import com.appslab.springbootapp.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		System.out.println();
		System.out.println();
		Programmer programmer = new Programmer(1254, 65);
		Teacher teacher = new Teacher(854, 36);
		Driver driver = new Driver(750, 41);
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		List<Employee> employees = Arrays.asList(programmer, teacher, driver);
		employees.forEach(Employee::getInfo);
		System.out.println(employeeService.getTotalSalary(employees));
		System.out.println(employeeService.getTotalBonus(employees));
	}

}

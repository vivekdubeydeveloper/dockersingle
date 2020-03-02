package com.vivek.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.employee.entity.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(1, "raj", 5000),
				new Employee(2, "raj", 6000),
				new Employee(3, "raj", 7000),
				new Employee(4, "raj", 8000)
				);
	}

}

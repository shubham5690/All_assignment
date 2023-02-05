package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.entity.Employee;
import com.map.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eService.addEmployee(employee);
	}

}

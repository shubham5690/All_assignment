package com.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.map.entity.Employee;
import com.map.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo eRepo;
	
	public Employee addEmployee(Employee employee) {
		return eRepo.save(employee);
		
	}
}

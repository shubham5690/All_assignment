package com.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.entity.Departemnt;
import com.map.repository.DepartmentRepo;


@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo dRepo;
	
	public Departemnt addDepartment(Departemnt department) {
		return dRepo.save(department);
		
	}
}

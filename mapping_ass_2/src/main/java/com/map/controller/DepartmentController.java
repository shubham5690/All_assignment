package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.entity.Departemnt;
import com.map.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService dService;
	
	@PostMapping("/department")
	public Departemnt saveDepartment(@RequestBody Departemnt departemnt) {
		return dService.addDepartment(departemnt);
	}

}

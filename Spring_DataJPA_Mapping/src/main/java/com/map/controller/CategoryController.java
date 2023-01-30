package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.entity.Category;
import com.map.entity.Student;
import com.map.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService cService;
	
	@PostMapping("/category")
	public ResponseEntity<Category> registerStudent(@RequestBody Category category){
		Category saveCategory=cService.addCategory(category);
		return new ResponseEntity<Category>(saveCategory,HttpStatus.ACCEPTED);
	}

}

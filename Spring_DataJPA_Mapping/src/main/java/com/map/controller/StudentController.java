package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.map.entity.Student;
import com.map.exception.StudentException;
import com.map.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService sService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> registerStudent(@RequestBody Student student){
		Student saveStudent=sService.addStudent(student);
		return new ResponseEntity<Student>(saveStudent,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id) throws StudentException{
		Student getStudent=sService.findStudentById(id);
		return new ResponseEntity<Student>(getStudent, HttpStatus.OK);
	}
}

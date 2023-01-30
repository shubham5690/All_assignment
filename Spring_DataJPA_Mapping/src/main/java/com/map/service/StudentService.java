package com.map.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.entity.Laptop;
import com.map.entity.Student;
import com.map.exception.StudentException;

import com.map.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	
	
	
	public Student addStudent(Student student) {
		
		return sRepo.save(student);
	}
	
	public Student findStudentById(Integer id) throws StudentException{
		Optional<Student> opt=sRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new StudentException("student not found by this id= "+id);
		}
	}

}

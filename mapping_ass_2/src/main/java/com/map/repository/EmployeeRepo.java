package com.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

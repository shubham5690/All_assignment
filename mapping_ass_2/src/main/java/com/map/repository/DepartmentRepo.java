package com.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.map.entity.Departemnt;

@Repository
public interface DepartmentRepo extends JpaRepository<Departemnt, Integer>{

}

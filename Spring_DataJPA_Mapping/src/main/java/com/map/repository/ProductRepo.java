package com.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.map.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,String>{
	
}

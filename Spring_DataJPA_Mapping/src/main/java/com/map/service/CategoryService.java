package com.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.entity.Category;
import com.map.entity.Product;
import com.map.repository.CategoryRepo;
import com.map.repository.ProductRepo;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepo cRepo;
	private ProductRepo pRepo;
	
	public Category addCategory(Category category) {
//		Product product=new Product();
//		product.setCategories(category.getCategoryID());
//		pRepo.save(product);
		return cRepo.save(category);
	}
}

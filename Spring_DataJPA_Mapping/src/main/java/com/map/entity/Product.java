package com.map.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
	@Id
	private String productID;
	private String productName;
	
	@ManyToMany
	private List<Category> categories=new ArrayList<>(); 

}

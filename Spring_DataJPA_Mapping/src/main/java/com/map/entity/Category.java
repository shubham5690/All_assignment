package com.map.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
public class Category {
	@Id
	private String categoryID;
	private String category;
	
	@ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
	private List<Product> products=new ArrayList<>();

}

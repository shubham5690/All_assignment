package com.map.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student {
	@Id
	private Integer id;
	private String name;
//	private String address;
	
	// here cascade is used to save the laptop in student table without manually save laptop first, one fk generate only
	// mappedby is used to hide forigen key
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private Laptop laptop;
	
	// all function perform by casacadeall like PERSIST, REMOVE, REFRESH, MERGE, DETACH.
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Address> Addresses;
	

}

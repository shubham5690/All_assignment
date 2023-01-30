package com.map.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Laptop {
	
	@Id
	private Integer laptopID;
	private String brand;
	
	@OneToOne
	@JoinColumn(name="student_id")//change the name of FK
	private Student student;

}

package com.map.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	private int addId;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int addId, String city, String country, Student student) {
		super();
		this.addId = addId;
		this.city = city;
		this.country = country;
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}

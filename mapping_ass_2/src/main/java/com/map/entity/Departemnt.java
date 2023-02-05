package com.map.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Departemnt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depId;
	private String depName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departemnt")
//	@JoinColumn(name = "emp_id")
	private List<Employee> employees;

	public Departemnt() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Departemnt(int depId, String depName, List<Employee> employees) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.employees = employees;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	

	public String getDepName() {
		return depName;
	}



	public void setDepName(String depName) {
		this.depName = depName;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}

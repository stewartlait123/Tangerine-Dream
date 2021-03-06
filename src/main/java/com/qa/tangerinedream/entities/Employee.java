// Created by Mohammed Miah                                       
package com.qa.tangerinedream.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "employee")

public class Employee{
	@Id
	@Column (name = "employee_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long employee_id;

	@Column (name = "name", nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)
	private String name;

	@Column (name = "employee_type", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int employee_type;

	@Column (name = "dept", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int department;

	@Column (name = "forklift_trained", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private boolean forklift_trained;
	
	public Employee(String name, int employeeType, int department, boolean forkliftTrained) {
		this.name = name;
		this.employee_type = employeeType;
		this.department = department;
		this.forklift_trained = forkliftTrained;
	}

	public long getEmployee_id(){
		return employee_id;
	}
	
	public void setName(String value){
		this.name = value;
	}
	
	public String getName(){
		return name;
	}
	
	public void setEmployee_type(int value) {
		this.employee_type = value;
	}
	
	public int getEmployee_type() {
		return employee_type;
	}
	
	public void setForklift_trained(boolean value) {
		this.forklift_trained = value;
	}
	
	public boolean getForklift_trained() {
		return forklift_trained;
	}
	
	public void setDepartment(int value) {
		this.department = value;
	}
	
	public int getDept() {
		return department;
	}
}

// Created by Mohammed Miah
package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;

public interface EmployeeRepository{
	public void persistEmployee(Employee p);
	public void persistEmployees(ArrayList<Employee> p);
	
	public Employee findByEmployeeId(long id);
	public ArrayList<Employee> getEmployees();
	
	public void updateEmployee(Employee p);
	public void removeEmployee(Employee p);
	public void addEmployee(Employee p);
}
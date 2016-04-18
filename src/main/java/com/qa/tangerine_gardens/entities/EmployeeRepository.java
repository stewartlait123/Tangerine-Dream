// Created by Mohammed Miah
package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;

public interface EmployeeRepository{
	public void persistEmployee(Employee employee);
	public void persistEmployees(ArrayList<Employee> employee);
	
	public Employee findByEmployeeId(long id);
	public ArrayList<Employee> getEmployees();
	
	public void updateEmployee(Employee employee);
	public void removeEmployee(Employee employee);
	public void addEmployee(Employee employee);
}
// Created by Mohammed Miah
package com.qa.tangerine_gardens.repository;

import java.util.ArrayList;

import javax.inject.Inject;

import entities.Employee;
import repositories.EmployeeRepository;
import dummy_data.InitialData;

public class EmployeeRepositoryOffline implements EmployeeRepository{
	@Inject
	private InitialData initialData;

	@Override
	public void persistEmployee(Employee employee){
		initialData.addEmployee(employee);
	}
	
	@Override
	public void persistEmployees(ArrayList<Employee> p){
		
	}
	
	@Override
	public Employee findByEmployeeId(long id){
		return null;
	}
	
	@Override
	public ArrayList<Employee> getEmployees(){
		return null;
	}
	
	@Override
	public void updateEmployee(Employee employee){
		
	}
	
	@Override
	public void removeEmployee(Employee employee){
		
	}
	
	@Override
	public void addEmployee(Employee employee){
		
	}

}

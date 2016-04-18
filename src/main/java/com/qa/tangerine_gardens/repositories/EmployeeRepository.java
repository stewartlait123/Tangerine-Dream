<<<<<<< HEAD:src/main/java/com/qa/tangerine_gardens/repositories/EmployeeRepository.java
package com.qa.tangerine_gardens.repositories;
=======
// Created by Mohammed Miah
package com.qa.tangerine_gardens.entities;
>>>>>>> 94f8133af6097cff3ecfc3a1e85be6a5642560ec:src/main/java/com/qa/tangerine_gardens/entities/EmployeeRepository.java

import java.util.ArrayList;

import com.qa.tangerine_gardens.entities.Employee;

public interface EmployeeRepository{
	public void persistEmployee(Employee p);
	public void persistEmployees(ArrayList<Employee> p);
	
	public Employee findByEmployeeId(long id);
	public ArrayList<Employee> getEmployees();
	
	public void updateEmployee(Employee p);
	public void removeEmployee(Employee p);
	public void addEmployee(Employee p);
}
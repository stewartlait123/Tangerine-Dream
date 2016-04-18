package repositories;

import java.util.ArrayList;

import entities.Employee;

public interface EmployeeRepository{
	public void persistEmployee(Employee p);
	public void persistEmployees(ArrayList<Employee> p);
	
	public Employee findByEmployeeId(long id);
	public ArrayList<Employee> getEmployees();
	
	public void updateEmployee(Employee p);
	public void removeEmployee(Employee p);
	public void addEmployee(Employee p);
}
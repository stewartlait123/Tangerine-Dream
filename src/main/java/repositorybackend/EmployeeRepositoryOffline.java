// Created by Mohammed Miah
package repositorybackend;

import java.util.ArrayList;

import javax.inject.Inject;

import repositorybackend.*;

public class EmployeeRepositoryOffline implements EmployeeRepository{
	@Inject
	private InitialData initialData;

	@Override
	public void persistEmployee(Employee employee){
		initialData.addEmployee(employee);
	}
	
	@Override
	public void persistEmployees(ArrayList<Employee> employees){
		initialData.setEmployees(employees);
	}
	
	@Override
	public Employee findByEmployeeId(long id){
		ArrayList<Employee> employeeList = initialData.getEmployees();
		Employee employee = null;
		
		for(int i = 0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getEmployee_id() == id){
				employee = employeeList.get(i);
				break;
			}
		}
		
		return employee;
	}
	
	@Override
	public ArrayList<Employee> getEmployees(){
		return initialData.getEmployees();
	}
	
	@Override
	public void updateEmployee(Employee employee){
		ArrayList<Employee> employeeList = initialData.getEmployees();
		
		for(int i=0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getEmployee_id() == employee.getEmployee_id())
				employeeList.set(i, employee);
		}
		
		initialData.setEmployees(employeeList);
	}
	
	@Override
	public void removeEmployee(Employee employee){
		ArrayList<Employee> employeeList = initialData.getEmployees();
		
		for(int i=0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getEmployee_id() == employee.getEmployee_id())
				employeeList.remove(i);
		}
		
		initialData.setEmployees(employeeList);
	}
	
	@Override
	public void addEmployee(Employee employee){
		initialData.addEmployee(employee);
	}
}

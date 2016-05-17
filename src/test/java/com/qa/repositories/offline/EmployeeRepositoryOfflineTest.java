package com.qa.repositories.offline;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.tangerinedream.entities.Employee;
import com.qa.tangerinedream.repositories.offline.EmployeeRepositoryOffline;

public class EmployeeRepositoryOfflineTest {
	
	EmployeeRepositoryOffline employeeRepo;
	//String name, int employeeType, int department, boolean forkliftTrained
	Employee employee = new Employee("name", 1, 1, false);
	

	@Test
	public void testPersistEmployee() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		employeeRepo.persistEmployee(employee);
		assertNotNull(employeeRepo.findByEmployeeId((long) 1));
	}

	@Test
	public void testPersistEmployees() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		for(int i = 0; i < 5; i++)
		{
			employeeList.add(employee);
		}
		employeeRepo.persistEmployees(employeeList);
		assertTrue(employeeRepo.getEmployees().size() == 5 );
	}

	@Test
	public void testFindByEmployeeId() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		employeeRepo.persistEmployee(employee);
		assertNotNull(employeeRepo.findByEmployeeId(1));
	}

	@Test
	public void testGetEmployees() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		for(int i = 0; i < 5; i++)
		{
			employeeList.add(employee);
		}
		employeeRepo.persistEmployees(employeeList);
		assertTrue(employeeRepo.getEmployees().size() == 5 );
	}

	@Test
	public void testUpdateEmployee() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		employeeRepo.persistEmployee(employee);
		employee.setForklift_trained(true);
		employeeRepo.updateEmployee(employee);
		assertTrue(employeeRepo.findByEmployeeId(1).getForklift_trained() == true);
	}

	@Test
	public void testRemoveEmployee() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		for(int i = 0; i < 5; i++)
		{
			employeeList.add(employee);
		}
		employeeRepo.persistEmployees(employeeList);
		employeeRepo.removeEmployee(employee);
		assertTrue(employeeRepo.getEmployees().size() == 4 );
	}

	@Test
	public void testAddEmployee() {
		employeeRepo = mock(EmployeeRepositoryOffline.class);
		employeeRepo.addEmployee(employee);
		assertNotNull(employeeRepo.getEmployees());
	}

}

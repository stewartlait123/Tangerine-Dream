/*
 * @author: Iain Q
 */

package com.qa.entities;


import com.qa.tangerinedream.entities.Employee;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	Employee employee = new Employee("name", 1, 1, true);
	
	@Test
	public void testEmployee() {
		Employee employee = new Employee("name", 1, 1, true);
		assertNotNull(employee);
	}

	@Test
	public void testGetEmployee_id() {
		assertNotNull(employee.getEmployee_id());
	}

	@Test
	public void testSetName() {
		employee.setName("");
		assertEquals("",employee.getName());
	}

	@Test
	public void testGetName() {
		Employee employee = new Employee("name", 1, 1, true);
		assertEquals("name",employee.getName());
	}

	@Test
	public void testSetEmployee_type() {
		employee.setEmployee_type(2);
		assertEquals(2,employee.getEmployee_type());
	}

	@Test
	public void testGetEmployee_type() {
		Employee employee = new Employee("name", 1, 1, true);
		assertEquals(1,employee.getEmployee_type());
	}

	@Test
	public void testSetForklift_trained() {
		employee.setForklift_trained(false);
		assertEquals(false,employee.getForklift_trained());
	}

	@Test
	public void testGetForklift_trained() {
		Employee employee = new Employee("name", 1, 1, true);
		assertEquals(true,employee.getForklift_trained());
	}

	@Test
	public void testSetDepartment() {
		employee.setDepartment(4);
		assertEquals(4,employee.getDept());
	}

	@Test
	public void testGetDept() {
		Employee employee = new Employee("name", 1, 1, true);
		assertEquals(1,employee.getDept());
	}

}

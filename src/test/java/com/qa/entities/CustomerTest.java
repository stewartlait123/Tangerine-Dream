package com.qa.entities;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.qa.tangerinedream.entities.Customer;

public class CustomerTest {

	Customer customer = new Customer((long) 1, "Johhny Test", "Test User" ,"test", new Date(), 0, 1000);
	@Test
	public void testCustomerStringStringStringDateIntInt() {
		Customer customer = new Customer("" , "" , "", new Date(), 0, 1000);
		assertNotNull(customer);
	}

	@Test
	public void testCustomer() {
		Customer customer = new Customer();
		assertNotNull(customer);
	}

	@Test
	public void testCustomerLongStringStringStringDateIntInt() {
		Customer customer = new Customer((long) 0 , "", "", "", new Date(), 0, 1000);
		assertNotNull(customer);
	}

	@Test
	public void testGetCustomerId() {
		assertNotNull(customer.getCustomerId());
	}

	@Test
	public void testGetName() {
		assertNotNull(customer.getName());
	}

	@Test
	public void testSetName() {
		customer.setName("Pie man");
		assertEquals("Pie man", customer.getName());
	}

	@Test
	public void testGetUsername() {
		assertNotNull(customer.getUsername());
	}

	@Test
	public void testSetUsername() {
		customer.setUsername("The Biggest Pie Boy");
		assertEquals("The Biggest Pie Boy", customer.getUsername());
	}

	@Test
	public void testGetPassword() {
		assertNotNull(customer.getPassword());
	}

	@Test
	public void testSetPassword() {
		customer.setPassword("secret pIe");
		assertEquals("secret pIe", customer.getPassword());
	}

	@Test
	public void testGetDob() {
		assertNotNull(customer.getDob());
	}

	@Test
	public void testSetCredit() {
		customer.setCredit(10);
		assertEquals((int) 10, (int)customer.getCredit());
	}

	@Test
	public void testGetCredit() {
		assertNotNull(customer.getCredit());
	}

	@Test
	public void testSetCreditLimit() {
		customer.setCreditLimit(25);
		assertEquals((int) 25, customer.getCreditLimit());
	}

	@Test
	public void testSetDOB() {
		
		//Did not simply want to create a new date for today, as it would not be different to the date
		//initially set for the customer on creation. I hate java date objects.
		SimpleDateFormat formatter = new SimpleDateFormat("30-07-1988");
		String dateInString = "7-Jun-2013";
		Date date = null;
		try {

			date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		customer.setDOB(date);
		
		assertEquals(date, customer.getDob());
	}

	@Test
	public void testGetCreditLimit() {
		assertNotNull(customer.getCreditLimit());
	}

	@Test
	public void testToString() {
		assertNotNull(customer.toString());
	}

}

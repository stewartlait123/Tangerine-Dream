package com.qa.entities;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.junit.Test;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.offline.CustomerRepositoryOffline;



public class CustomerRepositoryTest {
	
	Customer customer = new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 0, 0);

	CustomerRepositoryOffline customerRepo;
	
	@PostConstruct
	public void initialTest()
	{
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
	}
	
	@Test
	public void testFindByName() {
		
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.findByName("name"));
	}

	@Test
	public void testGetCustomers() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.getCustomers());
	}

	@Test
	public void testFindByID() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.findByID(1));
	}

	@Test
	public void testAddCustomer() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.getCustomers());
	}

	@Test
	public void testUpdateCustomerUserName() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updateCustomerUserName( (long) 1, "New UserName");
		assertNotNull(customerRepo.findUserByUsername("New UserName"));
	}

	@Test
	public void testUpdateCustomerName() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updateCustomerName( (long) 1, "New Name");
		assertNotNull(customerRepo.findByName("New Name"));
	}

	@Test
	public void testUpdatePassword() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updatePassword((long) 1, "New Password");
		Customer testCustomer =  customerRepo.findByID((long) 1);
		assertEquals("New Password", testCustomer.getPassword());
	}

	@Test
	public void testUpdateCredit() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updateCredit((long) 1, 100000);
		Customer testCustomer =  customerRepo.findByID((long) 1);
		assertEquals((int) 100000, (int)testCustomer.getCredit());
	}

	@Test
	public void testUpdateCreditLimitLongFloat() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updateCreditLimit( (long) 1, (long) 100000) ;
		Customer testCustomer = customerRepo.findByID(1);
		assertEquals((int) 100000, (int)testCustomer.getCredit());
	}

	@Test
	public void testGetUserID() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.getUserID("1"));
	}

	@Test
	public void testFindByUserPass() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.findByUserPass("user", "password"));
	}

	@Test
	public void testFindUserIdByUsername() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.findUserIdByUsername("test"));
	}

	@Test
	public void testFindUserByUsername() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		assertNotNull(customerRepo.findUserByUsername("user"));
	}

	@Test
	public void testUpdateCreditLimitLongLong() {
		customerRepo = mock(CustomerRepositoryOffline.class);
		customerRepo.addCustomer(customer);
		customerRepo.updateCreditLimit( (long) 1, (long) 100000) ;
		Customer testCustomer =  customerRepo.findByID((long) 1);
		assertEquals((int) 100000, (int)testCustomer.getCredit());
	}

}

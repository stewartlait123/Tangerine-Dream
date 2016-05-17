package com.qa.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.entities.Address;
import com.qa.tangerinedream.entities.Customer;

public class AddressTest {

	Address address = new Address("1 delivery address", "2 billing address", new Customer());
	

	@Test
	public void testAddress() {
		address = new Address();
		assertNotNull(address);
	}

	@Test
	public void testGetBilling_address() {
		assertNotNull(address.getBilling_address());
	}

	@Test
	public void testSetBilling_address() {
		address.setBilling_address("1");
		assertEquals("1", address.getBilling_address());
	}

	@Test
	public void testGetDelivery_address() {
		assertNotNull(address.getDelivery_address());
	}

	@Test
	public void testSetDelivery_address() {
		address.setDelivery_address("2");
		assertEquals("2", address.getDelivery_address());
	}

	@Test
	public void testGetCustomercustomer_id() {
		assertNotNull(address.getCustomercustomer_id());
	}

	@Test
	public void testSetCustomercustomer_id() {
		address.setCustomercustomer_id(new Customer());
		
	}

}

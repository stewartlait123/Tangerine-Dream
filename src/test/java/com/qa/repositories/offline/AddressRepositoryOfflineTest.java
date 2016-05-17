package com.qa.repositories.offline;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

import com.qa.tangerinedream.entities.Address;
import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.offline.AddressRepositoryOffline;


public class AddressRepositoryOfflineTest {

	AddressRepositoryOffline addressRepo;
	Customer customer = new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 0, 0);
	//String deliveryAddress ,String billingAddress, Customer customer
	Address address = new Address("delivery address", "billing address", customer);
	
	@Test
	public void testPersistAddress() {
		addressRepo = mock(AddressRepositoryOffline.class);
		addressRepo.persistAddress(address);
		assertNotNull(addressRepo.findBillingAddress("billing address"));
	}

	@Test
	public void testPersistAddresses() {
		addressRepo = mock(AddressRepositoryOffline.class);
		ArrayList<Address> addressList = new ArrayList<Address>();
		for(int i = 0; i < 5 ; i++)
		{
			addressList.add(address);
		}
		addressRepo.persistAddresses(addressList);
		assertTrue(addressRepo.getDeliveryAddresses().size() == 5);		
	}

	@Test
	public void testFindBillingAddress() {
		addressRepo = mock(AddressRepositoryOffline.class);
		addressRepo.persistAddress(address);
		assertNotNull(addressRepo.findBillingAddress("billing address"));
	}

	@Test
	public void testGetBillingAddresses() {
		addressRepo = mock(AddressRepositoryOffline.class);
		ArrayList<Address> addressList = new ArrayList<Address>();
		for(int i = 0; i < 5 ; i++)
		{
			addressList.add(address);
		}
		addressRepo.persistAddresses(addressList);
		assertTrue(addressRepo.getDeliveryAddresses().size() == 5);
	}

	@Test
	public void testFindDeliveryAddress() {
		addressRepo = mock(AddressRepositoryOffline.class);
		addressRepo.persistAddress(address);
		assertNotNull(addressRepo.findDeliveryAddress("delivery address"));
	}

	@Test
	public void testGetDeliveryAddresses() {
		addressRepo = mock(AddressRepositoryOffline.class);
		ArrayList<Address> addressList = new ArrayList<Address>();
		for(int i = 0; i < 5 ; i++)
		{
			addressList.add(address);
		}
		addressRepo.persistAddresses(addressList);
		assertTrue(addressRepo.getDeliveryAddresses().size() == 5);
	}

	@Test
	public void testSetBillingAddress() {
		addressRepo = mock(AddressRepositoryOffline.class);
		addressRepo.persistAddress(address);
		Address newAddress = new Address("delivery address", "new billing address", customer);
		addressRepo.setBillingAddress((long) 1, newAddress);
		assertEquals("new billing address", addressRepo.findBillingAddress("new billing address"));
	}

	@Test
	public void testSetDeliveryAddress() {
		addressRepo = mock(AddressRepositoryOffline.class);
		addressRepo.persistAddress(address);
		Address newAddress = new Address("new delivery address", "billing address", customer);
		addressRepo.setDeliveryAddress((long) 1, newAddress);
		assertEquals("new delivery address", addressRepo.findBillingAddress("new delivery address"));
	}

}

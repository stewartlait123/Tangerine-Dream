// Author @ Finley Peters - Team Tang 2016
// Repository interface class for Customer.
// Contains blueprints for database query classes.


package com.qa.tangerinedream.repositories;

import java.util.ArrayList;

import com.qa.tangerinedream.entities.Customer;

public interface CustomerRepository {
	
	
	public void persistCustomer (Customer customer_);
	public void persistCustomers (ArrayList<Customer> customers_);
	
	
	public ArrayList<Customer> findByName(String customerName_);
	public ArrayList<Customer> getCustomers();
	
	public Customer findByID(long userId);
	
	public void addCustomer (Customer customer_);
	
	public void updateCustomerUserName(Long id_, String userName_);
	
	public void updateCustomerName(Long id_, String customerName_);
	
	//Address removed as address does not reside in the customer table. Address is it's own object/table
	//public void updateCustomerAddress(Long id_, Address address_);
	
	public void updatePassword(Long id_, String password_);
	
	public void updateCredit(Long id_, float f);
	
	public void updateCreditLimit(Long id_, float f);
	
	public long getUserID(String lowerCase);
	
	public Customer findByUserPass(String lowerCase, String password);
	
	long findUserIdByUsername(String username);

	Customer findUserByUsername(String username_);
	void updateCreditLimit(Long id_, long creditLimit_);



}

// Author @ Finley Peters - Team Tang 2016
// Repository interface class for Customer.
// Contains blueprints for database query classes.


package com.qa.tangerine_gardens.entities;

import java.util.List;
import java.util.ArrayList;

public interface CustomerRepository {
	
	
	public void persistCustomer (Customer customer_);
	public void persistCustomers (List<Customer> customer_);
	
	
	public Customer findByName(String customerName_);
	public ArrayList<Customer> getCustomers();
	
	public void addCustomer (Customer customer_);
	
	public void removeCustomer (Customer customer_);
	
	public void updateCustomerUserName(String userName_);
	
	public void updateCustomerName(String customerName_);
	
	public void updateCustomerAddress(Address address_);
	
	public void updatePassword(String password_);
	
	public void updateCredit(int credit_);
	
	public void updateCreditLimit(int creditLimit_);

}

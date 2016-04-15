package com.qa.tangerine_gardens.entities;
import java.util.Currency;
import java.util.List;
import java.util.ArrayList;

public interface CustomerRepository {
	
	
	public void persistCustomer (Customer c);
	public void persistCustomers (List<Customer> c);
	
	
	public Customer findByName(String name);
	public ArrayList<Customer> getCustomers();
	
	public void addCustomer (Customer c);
	
	public void removeCustomer (Customer c);
	
	public void updateCustomerUserName(String s);
	
	public void updateCustomerName(String s);
	
	public void updateCustomerAddress(Address a);
	
	public void updatePassword(String s);
	
	public void updateCredit(Currency c);
	
	public void updateCreditLimit(Currency c);

}

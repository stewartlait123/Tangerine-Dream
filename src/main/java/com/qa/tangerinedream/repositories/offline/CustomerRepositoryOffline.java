package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;

import javax.inject.Inject;
import repositorybackend.InitialData;


import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CustomerRepository;

/**
 * @author Finley Peters TeamTang 2016
 *  Program which allows the user to Create, read the dummy data, and Update the files.
 *  All lists or just one row can be read and search can be done through ID number.
 */


public class CustomerRepositoryOffline
implements CustomerRepository{
	
	@Inject
	private InitialData initialData;
	
	@Override
	public void persistCustomer(Customer customer)
	{
		initialData.addCustomer(customer);
	}

	/**
	 * 
	 * Adjusted by Jessica/Christine. Created a for loop inside method to return array of customers one at a time (changed addCustomers to addcustomer like in InitialDate.java)
	 */
	@Override
	public void persistCustomers(ArrayList<Customer> customers_) {
		
		for(Customer customers : customers_){
					
		initialData.addCustomer(customers);
		
		}
	}
	
	@Override
	public Customer findByID(int id_)
	{
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				//If search name is equal to customer name, add to result list
				return searchList.get(i);
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Customer> findByName(String customerName_) {
				
		ArrayList<Customer> resultList = new ArrayList<Customer>(); //The list we will return
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search
		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getName().equals(customerName_))
			{
				//If search name is equal to customer name, add to result list
				resultList.add(searchList.get(i));
			}
		}
		
		return resultList;
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		// TODO Auto-generated method stub		
		
		return initialData.getCustomers();
	}

	@Override
	public void addCustomer(Customer customer_) {
		// TODO Auto-generated method stub
		
		initialData.addCustomer(customer_);
		
	}

	@Override
	public void removeCustomer(Customer customer_) {
		// TODO Auto-generated method stub
		
		initialData.removeCustomer(customer_);
		
	}

	@Override
	public void updateCustomerUserName(Long id_, String userName_) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setUsername(userName_);
				initialData.setCustomer(newDetails);
			}
		}		
	}

	@Override
	public void updateCustomerName(Long id_, String customerName_) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setName(customerName_);
				initialData.setCustomer(newDetails);
			}
		}		
	}

//	Address removed as address does not reside in the customer table. Address is it's own object/table
//	@Override
//	public void updateCustomerAddress(Long id_, Address address_) {
//		// TODO Auto-generated method stub
//
//		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
//		
//		for(int i = 0 ; i < searchList.size() ; i++ )
//		{
//			if(searchList.get(i).getCustomerId().equals(id_))
//			{
//				Customer newDetails = searchList.get(i);
//				newDetails.setAddress(address_);
//				initialData.setCustomer(newDetails);
//			}
//		}		
//	}

	@Override
	public void updatePassword(Long id_, String password_) {
		// TODO Auto-generated method stub

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setPassword(password_);
				initialData.setCustomer(newDetails);
			}
		}		
	}

	@Override
	public void updateCredit(Long id_, int credit_) {
		// TODO Auto-generated method stub

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setCredit(credit_);
				initialData.setCustomer(newDetails);
			}
		}		
	}

	@Override
	public void updateCreditLimit(Long id_, int creditLimit_) {
		// TODO Auto-generated method stub

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setCreditLimit(creditLimit_);
				initialData.setCustomer(newDetails);
			}
		}		
	}
}
package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import repositorybackend.InitialData;


import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CustomerRepository;

/**
 * @author Finley Peters TeamTang 2016
 *  Program which allows the user to Create, read the dummy data, and Update the files.
 *  All lists or just one row can be read and search can be done through ID number.
 */

@Stateless
@Default
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
	public Customer findByID(long id_)
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
	public void updateCustomerUserName(Long id_, String userName_) {

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setUsername(userName_);
				
			}
		}	
		initialData.setCustomers(searchList);
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
				
			}
		}
		initialData.setCustomers(searchList);
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
				
		}	
			}
			initialData.setCustomers(searchList);
		
	}

	@Override
	public void updateCredit(Long id_, float credit_) {
		// TODO Auto-generated method stub

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setCredit(credit_);
				
			}
		}
		initialData.setCustomers(searchList);
	}

	@Override
	public void updateCreditLimit(Long id_, long creditLimit_) {
		// TODO Auto-generated method stub

		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search		
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getCustomerId().equals(id_))
			{
				Customer newDetails = searchList.get(i);
				newDetails.setCreditLimit(creditLimit_);
				
			}
		}
		initialData.setCustomers(searchList);
	}

	@Override
	public long findUserIdByUsername(String username_) {
		
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			if(searchList.get(i).getUsername().equals(username_))
			{
				Customer searchResult = searchList.get(i);
				return searchResult.getCustomerId();				
			}
		}
		return 0;
	}

	@Override
	public long getUserID(String lowerCase) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer findByUserPass(String username, String password) {
		
		ArrayList<Customer> searchList = initialData.getCustomers(); //The list we will search
		
		for(int i = 0 ; i < searchList.size() ; i++ )
		{
			System.out.println("Searching");
			if(searchList.get(i).getUsername().equals(username))
			{
				System.out.println("Username matched");
				if(!searchList.get(i).getPassword().equals(password))
				{
					//wrong password message
					System.out.println("Password wrong");
					return null;
				}else{
					System.out.println("match found");
				Customer searchResult = searchList.get(i);
				return searchResult;
				}
			}
		}
		
		return null;
	}

	@Override
	public void updateCreditLimit(Long id_, float f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findUserByUsername(String username_) {
		// TODO Auto-generated method stub
		return null;
	}
}
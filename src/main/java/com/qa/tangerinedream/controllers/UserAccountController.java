package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CustomerRepository;

@Named(value="user_account")
@RequestScoped
public class UserAccountController{
	@Inject CustomerRepository customerRepo;
	
	public Customer getUserAccount(String username){
		//TODO: get the Customer object from the database
		//return CustomerRepository.getCustomer(username);
		return null;
	}
}



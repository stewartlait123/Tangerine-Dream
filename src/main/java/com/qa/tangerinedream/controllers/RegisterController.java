package com.qa.tangerinedream.controllers;

import java.sql.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CustomerRepository;

@Named(value="register")
@RequestScoped
public class RegisterController {
	
	@Inject CustomerRepository customerRepo;
	
	private String name = "";
	private String username = "";
	private String password = "";
	private Date dob;
	
	private void Register()
	{
		Customer customer = new Customer();
		customer.setName(name);
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setDOB(dob);
		customerRepo.addCustomer(customer);
	}
}

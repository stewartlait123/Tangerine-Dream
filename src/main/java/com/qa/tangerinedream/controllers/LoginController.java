package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.repositories.CustomerRepository;

@Named(value="login")
@RequestScoped
public class LoginController{
	@Inject CustomerRepository customerRepo;
	
	public boolean Login(String username, String password){
		boolean userValid = false;
		
		// Check username and password are not empty.
		if (username != "" && password != ""){
			//TODO: next check the database to authenticate the user.
			//userValid = LoginService.validateUser(username, password);
			
			if (userValid){
				//TODO: Customer customer = CustomerRepository.getCustomer(username);
				return true;
			}
		}
		
		// If user was not found, return false.
		return false;
	}
	
	public void Logout(){
		// TODO: Log out the user by destroying all data held about them in the current session.
	}
}
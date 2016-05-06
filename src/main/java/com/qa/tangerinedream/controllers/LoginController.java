package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.service.CustomerService;

@Named(value="login")
@RequestScoped
public class LoginController{
	@Inject CustomerRepository customerRepo;
	@Inject CustomerService customerService;
	@Inject CurrentUser currentUser;
	
	private String username = "";
	private String password = "";
	private String error = "";
	
	public String login()
	{
		System.out.println("Logging in...");
		if(username.equals(""))
		{
			error = "Please enter a username";
			password = "";
			return "login";
		}
		if(password.equals(""))
		{
			error = "Please enter a password";
			password = "";
			return "login";
		}
		
		if(!customerService.validateDetails(username, password)){
			error = "Invalid Login";
			password = "";
			return "login";
		}
		error = "Logged in";
		currentUser.setUser(customerService.findUserIdByUsername(username));
		return "LandingPage";
	}
	
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	
	public String getError()
	{
		return error;
	}
	
	public void setUsername(String username_)
	{
		username = username_;;
	}
	public void setPassword(String password_)
	{
		password = password_;
	}
	
	public void setError(String error_)
	{
		error = error_;
	}
	
	/*
	public boolean Login(String username, String password){
		boolean userValid = true;
		
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
	*/
	
	public void Logout(){
		// TODO: Log out the user by destroying all data held about them in the current session.
	}
}
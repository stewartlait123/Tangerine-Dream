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
		currentUser.setUserID(customerService.findUserIdByUsername(username));
		currentUser.setLoginStatus(true);
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
	
	
	public String logout(){
		currentUser.setUserID(0);
		currentUser.setLoginStatus(false);
		return "LandingPage";
	}
}
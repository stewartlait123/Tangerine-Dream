/*
 * @author - Umar*/
package com.qa.tangerinedream.controllers;

import java.sql.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.service.RegisterService;

@Named(value="register")
@RequestScoped
public class RegisterController {
	
	@Inject RegisterService registerService;
	
	private String name = "";
	private String username = "";
	private String password = "";
	private String confirmPassword = "";
	private Date dob;
	private String error;
	
	public void register() {
		if (registerService.ValidateDetails(name, username, password, confirmPassword, dob)){
			Customer customer = new Customer();
			customer.setName(name);
			customer.setUsername(username);
			customer.setPassword(password);
			customer.setDOB(dob);
			registerService.addCustomer(customer);
		}
	}
	
	public void setName(String value)
	{
		name = value;
	}
	public void setUsername(String value){
		username = value;
	}
	public void setPassword(String value){
		password = value;
	}
	public void setDOB(Date value){
		dob = value;
	}
	public void setError(String value){
		error = value;
	}
	public void setConfirmPassword(String value){
		confirmPassword = value;
	}
	public String getName(){
		return name;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public Date getDOB(){
		return dob;
	}
	public String getError(){
		return error;
	}
	public String confirmPassword(){
		return confirmPassword;
	}
}

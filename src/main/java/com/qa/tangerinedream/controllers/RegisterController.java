/*
 * @author - Umar*/
package com.qa.tangerinedream.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
	private String dd = "";
	private String mm = "";
	private String yyyy = "";
	private String error;
	
	public void register() {
		
		@SuppressWarnings("deprecation")
		Date date = new Date(Integer.parseInt(yyyy) - 1900, (Integer.parseInt(mm) - 1), Integer.parseInt(dd));
		//Date date = convertStringToDate(dd+ "/" + mm + "/" + yyyy);
		
		if (registerService.ValidateDetails(name, username, password, confirmPassword, date)){
			
			//Date convertDob = registerService.convertStringToDate(date);
			Random randomGenerator = new Random();
			
			int randomInt = randomGenerator.nextInt(1000000);
			
			Customer customer = new Customer(randomInt, name, username, password, date, 5, 5);
			//customer.setName(name);
			//customer.setUsername(username);
			//customer.setPassword(password);
			//customer.setDOB(date);
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
	public void setDd(String value)
	{
		dd = value;
	}
	public void setMm(String value)
	{
		mm = value;
	}
	public void setYyyy(String value)
	{
		yyyy = value;
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
	public String getDd()
	{
		return dd;
	}
	public String getMm()
	{
		return mm;
	}
	public String getYyyy()
	{
		return yyyy;
	}
	public String getError(){
		return error;
	}
	public String getConfirmPassword(){
		return confirmPassword;
	}
}

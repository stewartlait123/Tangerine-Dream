package com.qa.tangerinedream.controllers;

import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.service.CustomerService;

@Named(value="user_account")
@RequestScoped
public class UserAccountController{
	
	@Inject CustomerService customerService;
	@Inject CurrentUser currentUser;
	@Inject CustomerRepository customerRepo;
	
	private String username = "";
	private String name = "";
	private String dd;
	private String mm;
	private String yyyy;
	private String error = "";
	
	private boolean init = false;
	
	public void setInit(boolean value){
		System.out.println("init set called");
		this.init = value;
	}
	public boolean getInit(){
		System.out.println("init get called");
		getUserAccount();
		return this.init;
	}
	
	public void getUserAccount(){
		
		Customer cust = customerService.findUserById(currentUser.getUserID());
		if (cust != null)
		{
			Calendar cal = Calendar.getInstance();
			//Get customer date of birth
			cal.setTime(cust.getDob());
			//Get day, month and year from date
			String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
			String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
			String year = String.valueOf(cal.get(Calendar.YEAR));
			
			this.setUsername(cust.getUsername());
			this.setName(cust.getName());
			this.setDd(day);
			this.setMm(month);
			this.setYyyy(year);
		}
	}
	
	public String trackOrder(long orderID){
		//TODO: get the tracking info of the order from the OrderService
		//OrderService orderService;
		//return orderService.trackOrder(orderID);
		
		return "";
	}
	
	public String cancelOrder(long orderID){
		//TODO: Cancel the order using the OrderService
		//OrderService orderService;
		//return orderService.cancelOrder(orderID);
		
		return "";
	}
	
	public Order[] getOrderHistory(long orderID){
		//TODO: Get an array of all the users past orders using the OrderService.
		//OrderService orderService;
		//return orderService.getOrderHistory(userID);
		return null;
	}

	public Order getWishList(long userID){
		//TODO: Get a users wish list using CustomerService.
		//CustomerService customerService;
		//return customerService.getWishList(userID);
		return null;
	}

	public void changeName(long userID, String newName){
		//TODO: Change the users name using the CustomerService.
		//CustomerService customerService;
		//customerService.changeName(userID, newName);
	}

	public void changeEmail(long userID, String newEmail){
		//TODO: Change the users E-mail using the CustomerService.
		//CustomerService customerService;
		//customerService.changeName(userID, newEmail);
	}

	public void changePassword(long userID, String newPassword){
		//TODO: Change the users password using the CustomerService.
		//CustomerService customerService;
		//customerService.changePassword(userID, newPassword);
	}

	public void addAddress(long userID, String newAddress){
		//TODO: Add a new Address using the CustomerService.
		//CustomerService customerService;
		//customerService.addAddress(userID, newAddress);
	}
	
	public void updateDetails()
	{
		@SuppressWarnings("deprecation")
		Date date = new Date(Integer.parseInt(yyyy), Integer.parseInt(mm), Integer.parseInt(dd));
		
		if (customerService.validateDetails(username, date)){
			//Update details
		}
	}
	
	public void setName(String value){
		this.name = value;
	}
	public void setUsername(String value){
		this.username = value;
	}
	public void setDd(String value){
		this.dd = value;
	}
	public void setMm(String value){
		this.mm = value;
	}
	public void setYyyy(String value){
		this.yyyy = value;
	}
	
	public String getName(){
		return name;
	}
	public String getUsername(){
		return username;
	}
	public String getDd(){
		return dd;
	}
	public String getMm(){
		return mm;
	}
	public String getYyyy(){
		return yyyy;
	}
	
}



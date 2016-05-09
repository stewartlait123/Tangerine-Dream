package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.service.CustomerService;

@Named(value="user_account")
@RequestScoped
public class UserAccountController{
	@Inject CustomerService customerservice;
	
	public Customer getUserAccount(String username){
		//TODO: get the Customer object from the database
		//return CustomerRepository.getCustomer(username);
		return null;
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
}



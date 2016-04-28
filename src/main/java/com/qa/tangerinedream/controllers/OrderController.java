/*
 * 
 * Author = Finley, Team Tang 2016
 * 
 */

package com.qa.tangerinedream.controllers;


import javax.faces.bean.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.service.OrderService;


@Named(value = "order")

@RequestScoped

public class OrderController {
		
	//Injection commented out for now as services are not created. To be uncommented/edited at later date
	//@Inject
	@Inject OrderService orderService; 
	@Inject CurrentUser currentUser;
	
	private int orderId = 0; //The Id to be used in searching for specific orders
	
	
	/*
	 * List of required functions
	 * 
	 * View order history
	 * 
	 * 
	 * Cancel order
	 * 
	 * 
	 * Search order
	 * 
	 * 
	 * Confirm order
	 * 
	 */
	

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	private int customerId = 0; //The Id of the customer to use in getOrderHistory	
	
	
	public void getOrderHistory(){}; //Returns ArrayList of previous orders
	
	public void cancelOrder(){}; //Returns a boolean if order has been successfully cancelled or not after cancelling
	
	public void searchForOrder(){}; //Returns order that meets criteria
	
	public void cofirmOrder(){}; // returns a boolean if order has been successfully confirmed or not

	

}

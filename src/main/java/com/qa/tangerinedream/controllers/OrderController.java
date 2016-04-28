/*
 * 
 * Author = Finley, Team Tang 2016
 * 
 */

package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;


@Named(value = "order")
@RequestScoped

public class OrderController {
		
	//Injection commented out for now as services are not created. To be uncommented/edited at later date
	//@Inject
	@Inject OrderService orderService; 
	@Inject CurrentUser currentUser;
	
	private int orderId = 0; //The Id to be used in searching for specific orders
	private int customerId = 0; //The Id of the customer to use in getOrderHistory	
	
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
	
	public ArrayList<Order> getOrderHistory(){};
	
	public String cancelOrder(){};
	
	public String searchForOrder(){};
	
	public String cofirmOrder(){};
	

}

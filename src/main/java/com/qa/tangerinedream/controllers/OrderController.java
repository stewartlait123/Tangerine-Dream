/*
 * 
 * Author = Finley, Team Tang 2016
 * 
 */

package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.faces.bean.RequestScoped;	

import com.qa.tangerinedream.entities.Order;



@RequestScoped

public class OrderController {
		
	//Injection commented out for now as services are not created. To be uncommented/edited at later date
	//@Inject
	//OrderService orderService; 
	
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
	
	private int orderId = 0; //The Id to be used in searching for specific orders
	private int customerId = 0; //The Id of the customer to use in getOrderHistory	
	
	
	public ArrayList<Order> getOrderHistory(){}; //Returns ArrayList of previous orders
	
	public boolean cancelOrder(){}; //Returns a boolean if order has been successfully cancelled or not after cancelling
	
	public Order searchForOrder(){}; //Returns order that meets criteria
	
	public boolean cofirmOrder(){}; // returns a boolean if order has been successfully confirmed or not
	

}

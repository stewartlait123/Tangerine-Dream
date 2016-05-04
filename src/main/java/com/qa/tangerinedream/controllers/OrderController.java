/*
 * 
 * Author = Finley, Team Tang 2016
 * 
 */

package com.qa.tangerinedream.controllers;


import javax.faces.bean.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.service.OrderService;


@Named(value = "order")

@RequestScoped

public class OrderController {
		
	//Injection commented out for now as services are not created. To be uncommented/edited at later date
	//@Inject
	@Inject OrderService orderService; 
	@Inject CurrentUser currentUser;
	
	private Order order = orderService.getUsersPendingOrder(currentUser.getUserID());
	private float totalPrice = orderService.calcOrderTotalPlaced(currentUser.getUserID());
	
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
	

	public Long getOrderId() {
		return order.getOrder_id();
	}

	public Long getCustomerId() {
		return currentUser.getUserID();
	}
	
	
	public Order getOrderHistory( long userID){
		
		orderService.getUsersOrderHistory(userID);
		return order;
	}
	
	public void cancelOrder(){
		
		orderService.clearOrder(currentUser.getUserID());
		
	}
	
	public void searchForOrder(){
		
		// TODO hook into order search functionality in relevent Bean.
		
	}
	
	public String cofirmOrder(){
		
		orderService.placeOrder(order, currentUser.getUserID());
	 return "order";
	}
	
	public Order getPlacedOrder(long userID){
		Order order = orderService.getUsersPlacedOrders(userID);
		return order;
	}

    public float getTotalCostPending(){
    	return totalPrice;
    }
}

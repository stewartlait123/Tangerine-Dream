/*
 * 
 * Author = Finley, Team Tang 2016
 * 
 */

package com.qa.tangerinedream.controllers;


import java.util.List;

import javax.faces.bean.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.service.OrderService;


@Named(value = "order")
@RequestScoped
public class OrderController {
	@Inject private OrderService orderService; 
	@Inject private CurrentUser currentUser;
	@Inject private PendingOrder pendingOrder;
	
	private Order order;
	
	private float totalPrice;
	private float totalPaid;
	private float totalPlaced;
	
	@Deprecated
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
	
	public String placeOrder() {
		orderService.placeOrder(pendingOrder.getOrder().getOrder_id(), currentUser.getUserID());
		return "Order.xhtml";
	}
	
	public Order getOrder(){
		order = orderService.getUsersPlacedOrders(currentUser.getUserID());
		return order;
	}

	@Deprecated
	public List<OrderLine> getPaidOrderLines(){
		Order order = orderService.getUsersPaidOrders(currentUser.getUserID());
		return order.getOrderLines();
	}
	
    public float getTotalCostPending(){
    	totalPrice =  orderService.calcOrderTotalPending(currentUser.getUserID());
    	return totalPrice;
    }
    
    public float getTotalCostPaid(){
		totalPaid = orderService.calcOrderTotalPaid(currentUser.getUserID());
    	return totalPaid;
    }
    
    public float getTotalCostPlaced(){
		totalPlaced = orderService.calcOrderTotalPlaced(currentUser.getUserID());
    	return totalPlaced;
    }
}

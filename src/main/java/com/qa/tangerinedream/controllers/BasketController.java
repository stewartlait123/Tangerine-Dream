package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.service.OrderService;

@Named(value = "basket")
@RequestScoped
public class BasketController {
	@Inject OrderService orderService;
	@Inject CurrentUser currentUser;
	private Order order = orderService.getUsersPendingOrder(currentUser.getUserID());
	private float totalPrice = orderService.calcOrderTotalPending(currentUser.getUserID());
	
	public void addToBasket(long productId){
		orderService.addToBasket(productId, currentUser.getUserID());
	}
	
	public String removeFromBasket(long productId){
		orderService.removeFromBasket(productId, currentUser.getUserID());
		return "basket";
	}
	
	public String updateQuantity(){
		orderService.updateOrder(order, currentUser.getUserID());
		return "basket";
	}
	
	public String clearBasket(){
		orderService.clearOrder(currentUser.getUserID());
		return "basket";
	}
	
	public String placeOrder() {
		orderService.placeOrder(order, currentUser.getUserID());
		return "order";
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public float getTotalPrice() {
		return totalPrice;
	}
}
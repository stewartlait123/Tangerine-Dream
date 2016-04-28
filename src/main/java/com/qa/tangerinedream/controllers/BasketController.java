package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;

@Named(value = "Basket")
@RequestScoped
public class BasketController {
	private Order order;
	private float totalPrice;
	
	public void addToBasket(){
		
	}
	
	public String removeFromBasket(){
		
		return "basket";
	}
	
	public String updateQuantity(){
		
		return "basket";
	}
	
	public String clearBasket(){
		
		return "basket";
	}
	
	public String placeOrder() {
		
		return "order";
	}
}
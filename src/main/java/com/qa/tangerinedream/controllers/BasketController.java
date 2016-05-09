package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.service.OrderService;

/**
 * This is the controller for all requests regarding the basket
 * 
 * @author James Thompson
 */
@Named(value = "basket")
@RequestScoped
public class BasketController {
	@Inject OrderService orderService;
	@Inject CurrentUser currentUser;
	private Order order;
	private float totalPrice;
	
	/**
	 * This method adds the specified product to the basket
	 * 
	 * @param productId - the products id
	 */
	
	public void addToBasket(long productId, int quantity){
		orderService.addToBasket(productId, quantity, currentUser.getUserID());
	}
	
	/**
	 * This method removes the specified product from the basket
	 * 
	 * @param productId - the product to be removed
	 * @return - returns basket which should redirect the user to the basket page
	 */
//	public String removeFromBasket(long productId){
//		orderService.removeFromBasket(productId, currentUser.getUserID());
//		return "basket";
//	}
	
	/**
	 * This method updates the whole basket's quantity
	 * 
	 * @return - reloads the basket page
	 */
	public String updateQuantity(){
		orderService.updateOrder(order, currentUser.getUserID());
		return "basket";
	}
	
	/**
	 * This method tells the service layer to remove all items from the basket
	 * 
	 * @return - reloads the basket
	 */
	public String clearBasket(){
		orderService.clearOrder(currentUser.getUserID());
		return "basket";
	}
	
	/**
	 * This method tells the order service to place the current order
	 * 
	 * @return - sends the user to the order page
	 */
	public String placeOrder() {
		orderService.placeOrder(order, currentUser.getUserID());
		return "order";
	}
	
	/**
	 * gets the basket
	 * 
	 * @return - The Users Basket
	 */
	public Order getOrder() {
		if(order == null)
			order = orderService.getUsersPendingOrder(currentUser.getUserID());
		return order;
	}

	/**
	 * Sets the basket
	 * 
	 * @param order - the updated order information
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	

	/**
	 * Gets the total price of the order
	 * 
	 * @return - the price
	 */
	public float getTotalPrice() {
		totalPrice = orderService.calcOrderTotalPending(currentUser.getUserID());
		return totalPrice;
	}
}
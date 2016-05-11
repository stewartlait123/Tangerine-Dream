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
	@Inject private PendingOrder pendingOrder;
	@Inject private OrderService orderService;
	@Inject private CurrentUser currentUser;
	
	private float totalPrice;
	
	/**
	 * This method adds the specified product to the basket
	 * 
	 * @param productId - the products id
	 */
	public void addToBasket(long productId, int quantity) {
		orderService.addToBasket(productId, quantity, currentUser.getUserID());
	}
	
	/**
	 * This method removes the specified product from the basket
	 * 
	 * @param productId - the product to be removed
	 * @return - returns basket which should redirect the user to the basket page
	 */
	public String removeFromBasket(long productId){
		orderService.removeFromBasket(productId, currentUser.getUserID());
		pendingOrder.setOrder(orderService.getUsersPendingOrder(currentUser.getUserID()));
		return "basket";
	}
	
	/**
	 * This method updates the whole basket's quantity
	 * 
	 * @return - reloads the basket page
	 */
	public String updateQuantity(int quantity, long prod_ID){
		orderService.updatequantity(prod_ID, quantity, currentUser.getUserID());
		pendingOrder.setOrder(orderService.getUsersPendingOrder(currentUser.getUserID()));
		return "basket";
	}

	/**
	 * This method tells the service layer to remove all items from the basket
	 * 
	 * @return - reloads the basket
	 */
	public void clearBasket(){
		orderService.clearOrder(currentUser.getUserID());
		pendingOrder.setOrder(orderService.getUsersPendingOrder(currentUser.getUserID()));
	}
	
	/**
	 * This method tells the order service to place the current order
	 * 
	 * @return - sends the user to the order page
	 */
	
	
	/**
	 * gets the basket
	 * 
	 * @return - The Users Basket
	 */
	public Order getOrder() {
		if(pendingOrder.getOrder() == null)
			pendingOrder.setOrder(orderService.getUsersPendingOrder(currentUser.getUserID()));
		return pendingOrder.getOrder();
	}

	/**
	 * Sets the basket
	 * 
	 * @param order - the updated order information
	 */
	public void setOrder(Order order) {
		pendingOrder.setOrder(order);
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
package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;
/**
 * 
 * @author James Thompson
 *
 */
@Named(value="ordered")
@PageScoped
public class BasketController {
	@Inject BesketService basketService;
	@Inject LoggedInUser loggedInUser;
	
	public ArrayList<Product> getItems() {
		return basketService.getBasket(loggedInUser.getID);
	}
}
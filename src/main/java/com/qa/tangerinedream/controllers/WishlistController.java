/**
 * 
 * @author Stewart Lait
 *
 */

package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.BasketService;

@Named(value="wishlist")
@RequestScoped
public class WishlistController {
	@Inject BasketService basketService;

	
	public ArrayList<Product> addProduct(long prod_ID){
		basketService.add_product(prod_ID);
		
	public ArrayList<Product> removeProduct(long prod_ID){
		basketService.remove_product(prod_ID);
		
	public ArrayList<Product> getItem(){
		return basketService.get_item();
		
	public ArrayList<Product> moveProduct(long prod_ID){
		basketService.move_product(prod_ID);
		
	public ArrayList<Product> moveProduct(long prod_ID){
		basketService.move_product();
	
	private long prod_ID;
		public long getproductID(){
			return prod_ID;
		}
			
		}
	
	}
		
	
	}
	
	}
}

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

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.BasketService;

@Named(value="wishlist")
@RequestScoped
public class WishlistController {
	@Inject BasketService basketService;

	
	public void addProduct(){
		basketService.add_product(prod_ID);
	}
	public void removeProduct(){
		basketService.remove_product(prod_ID);
	}	
	public ArrayList<Product> getItem(){
		return basketService.get_item();
	}	
	public void moveProduct1(){
		basketService.move_product(prod_ID);
	}	
	public void moveProduct(){
		basketService.move_product(prod_ID);
	}
	private long prod_ID;
		public long getproductID(){
			return prod_ID;
		}
			
	
		
	
	
}

package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;

/**
 * 
 * @author Christine Stokes
 *
 */
@Named(value = "Basket")
@RequestScoped

public class Basket {
@Inject BasketService basketService;
private long prod_ID;

public long get_prod_ID(){
	return prod_ID;
}


public ArrayList<Product> add_product(long prod_ID){
	basketService.add_product(prod_ID);
}

public ArrayList<Product> remove_product(long prod_ID){
	basketService.remove_product(prod_ID);
}

public ArrayList<Product> empty_basket(){
	basketService.empty_basket();
}

public ArrayList<Product> change_quantity(long prod_ID){
	basketService.change_quantity(prod_ID);
}

public ArrayList<Product> getItems(){
	return basketService.getbasket();
} 

public float getTotalCost(){
	return basketService.getTotalCost();
}

}

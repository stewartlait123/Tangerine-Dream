package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.BasketService;

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


public void add_product(){
	basketService.add_product(prod_ID);
}

public void remove_product(){
	basketService.remove_product(prod_ID);
}

public void empty_basket(){
	basketService.empty_basket();
}

public void change_quantity(){
	basketService.change_quantity(prod_ID);
}

public ArrayList<Product> getItems(){
	return basketService.getbasket();
} 

public float getTotalCost(){
	return basketService.getTotalCost();
}

}

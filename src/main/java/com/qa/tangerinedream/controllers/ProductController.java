package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.ProductService;


/**
 * This is the controller for all requests regarding the product
 * 
 * @author Iain Q
 */
@Named(value = "product")
@RequestScoped
public class ProductController {
	@Inject ProductService productService;
	
	private Product product = productService.getProduct();
	
	public long getProductId(){
		return product.getProduct_id();
	}
	
	public String getProductName(){
		return product.getName();
	}
	
	public int getProductPrice(){
		return product.getPrice();
	}
	
	public String getProductType(){
		return product.getProduct_type();
	}
	
	
	
	
	
}

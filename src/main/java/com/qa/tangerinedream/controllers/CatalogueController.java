package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.CatalogueService;
/**
 * 
 * @author Iain Q
 *
 */
@Named(value="catalogue")
@RequestScoped
public class CatalogueController {
	@Inject CatalogueService catalogueService;
	
	
	public ArrayList<Product> getProducts() {	
		return catalogueService.getProducts();
	}
	
	public ArrayList<Product> searchProducts(String producttype) {
		return catalogueService.searchProducts(producttype);
	}
	
	public Product getProductById(long product_id){
		return catalogueService.getProductById(product_id);
	}
	

	
}
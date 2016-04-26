package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.ProductRepository;
/**
 * 
 * @author Iain Q
 *
 */
@Named(value="catalogue")
@RequestScoped
public class CatalogueController {
	@Inject CatalogueService catalogueService;
	
	private String productName= "";
	private String productType = "";
	
	public ArrayList<Product> getProducts() {
		return catalogueService.getProducts();
	}
	
	public ArrayList<Product> searchProducts() {
		return catalogueService.getProducts();
	}
	
}
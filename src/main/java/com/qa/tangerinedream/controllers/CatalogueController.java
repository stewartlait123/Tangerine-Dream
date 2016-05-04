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
	
	private String productName= "";
	private String productType = "";
	private String productImageLocation = "";
	
	
	public ArrayList<Product> getProducts() {
		return catalogueService.getProducts();
	}
	
	public ArrayList<Product> searchProducts() {
		return catalogueService.getProducts();
	}

	public String getProductName() {
		return productName;
	}


	public String getProductType() {
		return productType;
	}

	
}
package com.qa.tangerinedream.service;

/*
 * 
 * @author Iain Q
 * 
 */

import java.util.ArrayList;


import javax.inject.Inject;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.ProductRepository;



public class CatalogueService {
		@Inject ProductRepository productRepo;
		//no cataloguerepo as it's all in the product one
		
		public ArrayList<Product> getProducts() {
			return productRepo.getProducts();
		}
		
		public ArrayList<Product> searchProducts(String productType) {
		//must be add to ProductRepository.java
			return productRepo.findByProductType(productType);
		} 
	}


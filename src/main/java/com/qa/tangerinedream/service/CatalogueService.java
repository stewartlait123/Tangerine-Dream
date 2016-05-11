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
		
		//return all products in database
		public ArrayList<Product> getProducts() {
			return productRepo.getProducts();
		}
		
		//return all products of one type
		public ArrayList<Product> searchProducts(String productType) {
			return productRepo.findByProductType(productType);
		}

		//return one specific product
		public Product getProductById(long product_id) {
			return productRepo.findByProductId(product_id);
		} 
	}


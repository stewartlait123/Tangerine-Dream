package com.qa.tangerinedream.service;

/*
 * 
 * @author Iain Q
 * 
 */


import javax.inject.Inject;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.ProductRepository;

public class ProductService {

	
	@Inject ProductRepository productRepo;

	public Product getProduct(long productId) {
		return productRepo.findByProductId(productId);
	}

	
	
	

}

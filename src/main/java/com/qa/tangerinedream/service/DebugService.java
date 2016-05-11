package com.qa.tangerinedream.service;

import java.util.ArrayList;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.repositories.ProductRepository;

public class DebugService {
	@Inject CustomerRepository customerRepo;
	@Inject ProductRepository productRepo;
	
	public ArrayList<Customer> getCustomers(){
		
		return customerRepo.getCustomers();
	}
	
	public ArrayList<Product> getProducts(){
		
		return productRepo.getProducts();
	}
	
	
}

package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.service.CatalogueService;

@Named(value = "debugData")
@SessionScoped
public class DebugController {
	@Inject CustomerRepository customerRepo;
	@Inject CatalogueService catalogueService;
	
	
	public ArrayList<Customer> getCustomer(){
		
		return customerRepo.getCustomers();
		
	}
	
	public ArrayList<Product> getProduct(){
		
		return catalogueService.getProducts();
		
	}
	
}

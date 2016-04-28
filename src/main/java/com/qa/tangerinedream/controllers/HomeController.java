/*
 * @author - Umar */ 
package com.qa.tangerinedream.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.ProductRepository;

@Named(value="home")
@RequestScoped
public class HomeController {
	
	@Inject ProductRepository productRepo;
	
	ArrayList<Product> product = new ArrayList<Product>();
	
<<<<<<< HEAD
	public void GetProducts()
=======
	@SuppressWarnings("unused")
	private void GetProducts()
>>>>>>> 5290c4cdb2b5c2e1f393390e10ccf93a21d1a91f
	{
		productRepo.getProducts();
	}
}

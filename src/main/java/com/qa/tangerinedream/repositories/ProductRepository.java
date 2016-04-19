// Created by Mohammed Miah
package com.qa.tangerinedream.repositories;

import java.util.ArrayList;

import com.qa.tangerinedream.entities.Product;

public interface ProductRepository{
	public void persistProduct(Product product);
	public void persistProducts(ArrayList<Product> products);
	
	public Product findByProductId(long id);
	public ArrayList<Product> getProducts();
	
	public void updateProduct(Product product);
	public void removeProduct(Product product);
	public void addProduct(Product product);
}
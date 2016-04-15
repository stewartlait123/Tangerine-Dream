// Created by Mohammed Miah
package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;

public interface ProductRepository{
	public void persistProduct(Product p);
	public void persistProducts(ArrayList<Product> p);
	
	public Product findByProductId(long id);
	public ArrayList<Product> getProducts();
	
	public void updateProduct(Product p);
	public void removeProduct(Product p);
	public void addProduct(Product p);
}
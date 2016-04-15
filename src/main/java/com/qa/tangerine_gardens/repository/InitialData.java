// Created by Mohammed Miah and Umar
package com.qa.tangerine_gardens.repository;

import com.qa.tangerine_gardens.entities.*;
import com.qa.tangerine_gardens.entities.Product.PRODUCT_TYPE;
import java.util.ArrayList;
import javax.ejb.Singleton;

@Singleton
public class InitialData{
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public InitialData(){
		products.add(new Product(1, "pot", 100, 300, 10, 500, 1000, 100, 1000, PRODUCT_TYPE.POTS));
	}

	public ArrayList<Product> getProducts(){
		return products;
	}

	public void addProduct(Product product){
		products.add(product);
	}

	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
}
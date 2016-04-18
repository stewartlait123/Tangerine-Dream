// Created by Mohammed Miah
package com.qa.tangerine_gardens.repository;

import java.util.ArrayList;

import javax.inject.Inject;

import dummy_data.InitialData;

import repositories.*;
import entities.*;

public class ProductRepositoryOffline implements ProductRepository{
	@Inject
	private InitialData initialData;

	@Override
	public void persistProduct(Product product){
		initialData.addProduct(product);
	}
	
	@Override
	public void persistProducts(ArrayList<Product> p){
		
	}
	
	@Override
	public Product findByProductId(long id){
		return null;
	}
	
	@Override
	public ArrayList<Product> getProducts(){
		return null;
	}
	
	@Override
	public void updateProduct(Product p){
		
	}
	
	@Override
	public void removeProduct(Product p){
		
	}
	
	@Override
	public void addProduct(Product p){
		
	}
}
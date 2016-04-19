// Created by Mohammed Miah
package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.ProductRepository;

import repositorybackend.*;

public class ProductRepositoryOffline implements ProductRepository{
	@Inject
	private InitialData initialData;

	@Override
	public void persistProduct(Product product){
		initialData.addProduct(product);
	}
	
	@Override
	public void persistProducts(ArrayList<Product> products){
		initialData.setProducts(products);
	}
	
	@Override
	public Product findByProductId(long id){
		ArrayList<Product> productList = initialData.getProducts();
		Product product = null;
		
		for(int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProduct_id() == id){
				product = productList.get(i);
				break;
			}
		}
		
		return product;
	}
	
	@Override
	public ArrayList<Product> getProducts(){
		return initialData.getProducts();
	}
	
	@Override
	public void updateProduct(Product product){
		ArrayList<Product> productList = initialData.getProducts();
		
		for(int i=0; i < productList.size(); i++) {
			if(productList.get(i).getProduct_id() == product.getProduct_id())
				productList.set(i, product);
		}
		
		initialData.setProducts(productList);
	}
	
	@Override
	public void removeProduct(Product product){
		ArrayList<Product> productList = initialData.getProducts();
		
		for(int i=0; i < productList.size(); i++) {
			if(productList.get(i).getProduct_id() == product.getProduct_id())
				productList.remove(i);
		}
		
		initialData.setProducts(productList);
	}
	
	@Override
	public void addProduct(Product product){
		initialData.addProduct(product);
	}
}
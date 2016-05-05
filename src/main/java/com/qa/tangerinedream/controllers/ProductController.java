package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.service.ProductService;


/**
 * This is the controller for all requests regarding the product
 * 
 * @author Iain Q
 */
@Named(value = "product")
@RequestScoped
public class ProductController {
	@Inject ProductService productService;
	private long product_id;
	private String name = "";
	private int price;
	private String product_type = "";
	private String imageLocation = "";
	private int stock;
	private int cost_price;
	private int size;
	private int weight;
	private int minStock;
	private int orderAmount;
	
	//private Product product = productService.getProduct(productId);
	
	
	/*public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}*/

	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost_price;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}


	public int getMinStock() {
		return minStock;
	}



	public int getOrderAmount() {
		return orderAmount;
	}



	/*public Product getProduct() {
		return product;
	}*/


	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	public long getProduct_Id(){
		return product_id;
	}
	
	public String getProductName(){
		return name;
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getproduct_type(){
		return product_type;
	}
	
	public String getImageLocation(){
		return imageLocation;
	}
	
	public int getStock(){
		return stock;
	}
	
	
}

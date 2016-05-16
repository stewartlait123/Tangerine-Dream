package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.service.ProductService;


/**
 * This is the controller for all requests regarding the product
 * 
 * @author Iain Q
 */
@Named(value = "product")
@RequestScoped
public class ProductController {
	
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
	private String description = "";
	private ProductService productService;

	public String getName() {
			return name;
	}
	
	public String getDescription() {
		return description;
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

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public long getproduct_id(){
		return product_id;
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
	
	public void setName(String name){
		this.name = name;
	}

	public void setDescription(String description){
		this.description = description;
	}
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setproduct_id(long product_id) {
		this.product_id = product_id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public void setCost_price(int cost_price) {
		this.cost_price = cost_price;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}	
}
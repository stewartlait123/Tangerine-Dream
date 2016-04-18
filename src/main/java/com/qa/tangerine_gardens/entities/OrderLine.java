package com.qa.tangerine_gardens.entities;

/**
 * 
 * @author Jessica Maddocks 
 * @version 2.1
 * The Entity for the Orderline class.
 * Christine Stokes created version 1.0.
 */

public class OrderLine {
	
	private Order order;
	private Product product;  
	private int quantity;
	private int purchasePrice;
	
	//constructors for attributes
	public void OrderLine (Order order, Product product, int quantity, int purchasePrice) {
	
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		
	}
	
	//attributes getters
	public Order getorder(){
		
		return order;  
	}
	
	public Product getproduct(){
		
		return product;
	
	}

	public int getquantity(){
		
		return quantity; 
		
	}
	
	public int getpurchasePrice(){
		
		return purchasePrice;
		
	}
	
	//attributes setters
	public void setorder(Order order){
		
		this.order = order;  
		
	}
	
	public void setproduct(Product product){
		
		this.product = product;
	
	}

	public void setquantity(int quantity){
		
		this.quantity = quantity; 
		
	}
	
	public void setpurchasePrice(int purchasePrice){
		
		this.purchasePrice = purchasePrice;
		
	}
	
}
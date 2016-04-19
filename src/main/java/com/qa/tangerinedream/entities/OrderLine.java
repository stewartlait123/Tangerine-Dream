package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Jessica Maddocks 
 * @version 2.1
 * The Entity for the Orderline class.
 * Christine Stokes created version 1.0.
 */

@Entity
@Table (name = "OrderLines")
public class OrderLine {
	@Id 
	@ManyToOne
	@JoinColumn (name = "order_fk", nullable = false)
	@Size (min = 4, max = 500)
	@NotNull
	private Order order;
	
	@ManyToOne
	@JoinColumn (name = "product_fk", nullable = false)
	@Size (min = 4, max = 500)
	@NotNull 
	private Product product;  
	
	@Column (name = "quantity", nullable = false)
	@NotNull	
	private int quantity;
	
	@Column (name = "purchasePrice", nullable = false)
	@NotNull
	private int purchasePrice;

	//constructor for attributes
	public OrderLine (Order order, Product product, int quantity, int purchasePrice) {
	
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
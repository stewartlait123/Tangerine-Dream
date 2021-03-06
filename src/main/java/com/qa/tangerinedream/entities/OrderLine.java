package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@ManyToOne
	@JoinColumn (name = "product_fk", nullable = false)
	@Size (min = 4, max = 500)
	@NotNull 
	private Product product;  
	
	@Column (name = "quantity", nullable = false)
	@NotNull	
	private int quantity;
	
	@Column (name = "price", nullable = false)
	@NotNull
	private String price;
	
	@Column (name = "purchasePrice", nullable = false)
	@NotNull
	private int purchasePrice;
	
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getPrice() {
		return price;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="OrderID")
	private Order order;

	//constructor for attributes
	public OrderLine (Product product, int quantity, int purchasePrice) {
		this.product = product;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
	}
	
	public OrderLine (Product product, int quantity, String price){
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	public OrderLine() { }

	public Product getproduct(){
		
		return product;	
	}

	public int getquantity(){
		
		return quantity; 		
	}
	
	public int getpurchasePrice(){
		
		return purchasePrice;		
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
	
	public void setOrder(Order order){
		this.order = order;
		if(!order.getOrderLines().contains(this))
			order.addOrderLine(this);
	}

	public Order getOrder() {
		return order;
	}
	
	@Override
	public String toString() {
		return "OrderLine [product=" + product + ", quantity=" + quantity + ", purchasePrice=" + purchasePrice
				+ ", order=" + order + "]";
	}

}
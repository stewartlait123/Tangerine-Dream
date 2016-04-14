package com.qa.tangerine_gardens.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table (name = "product")

public class Product{
	@Id
	@Column (name = "product_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long product_id;

	@Column (name = "name", nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)
	private String name;

	@Column (name = "cost_price", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int cost_price;

	@Column (name = "price", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int price;

	@Column (name = "size", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int size;

	@Column (name = "weight", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int weight;

	@Column (name = "stock", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int stock;

	@Column (name = "min_stock", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int min_stock;

	@Column (name = "order_amount", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int order_amount;

	@Column (name = "product_type", nullable = false)
	@NotNull
	@Size (min = 0, max = 2147483647)
	private int product_type;
	
	public long getProduct_id(){
		return product_id;
	}
	
	public void setName(String value){
		this.name = value;
	}
	
	public String getName(){
		return name;
	}
	
	/**
	 * The maximum amount that the product should be bought for from a supplier
	 */
	public void setCost_price(int value){
		this.cost_price = value;
	}
	
	/**
	 * The maximum amount that the product should be bought for from a supplier
	 */
	public int getCost_price(){
		return cost_price;
	}
	
	/**
	 * The price that the product is currently selling for
	 */
	public void setPrice(int value){
		this.price = value;
	}
	
	/**
	 * The price that the product is currently selling for
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * size of the product in cubic centimeters
	 */
	public void setSize(int value){
		this.size = value;
	}
	
	/**
	 * size of the product in cubic centimeters
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * Weight of the product in gramms
	 */
	public void setWeight(int value){
		this.weight = value;
	}
	
	/**
	 * Weight of the product in gramms
	 */
	public int getWeight(){
		return weight;
	}
	
	/**
	 * The amount of stock that is currently available of the product
	 */
	public void setStock(int value) {
		this.stock = value;
	}
	
	/**
	 * The amount of stock that is currently available of the product
	 */
	public int getStock() {
		return stock;
	}
	
	public void setMin_stock(int value) {
		this.min_stock = value;
	}
	
	public int getMin_stock() {
		return min_stock;
	}
	
	/**
	 * The quantity of the product that should be bought when stock reaches min_stock
	 */
	public void setOrder_amount(int value) {
		this.order_amount = value;
	}
	
	/**
	 * The quantity of the product that should be bought when stock reaches min_stock
	 */
	public int getOrder_amount() {
		return order_amount;
	}
	
	public void setProduct_type(int value) {
		this.product_type = value;
	}
	
	public int getProduct_type() {
		return product_type;
	}
}

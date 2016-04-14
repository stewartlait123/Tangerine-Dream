package com.qa.tangerine_gardens;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name="orderline")

public class OrderLine {

	@Id
	@Column (name = "orderline_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private BigInteger orderline_id;
	
	@OneToMany 
	@JoinColumn(name = "product_id_fk", nullable = true)
	private int product_id_fk ;
	
	@OneToMany 
	@JoinColumn(name = "order_id_fk", nullable = true)
	private int order_id_fk ;
	
	@Column (name = "quantity")
	private int quantity;
	
	
	public OrderLine(){}

	

	
	public BigInteger getOrderline_id() {
		return orderline_id;
	}
	
	
	public int getOrderId()
	{
		return order_id_fk;
	}
	
	public int getProductId()
	{
		return product_id_fk;
	}
	
	
	public int getQuantity()
	{ return quantity; }

	public void setQuantity(int quantity)
	{ this.quantity = quantity; }
	
	
}

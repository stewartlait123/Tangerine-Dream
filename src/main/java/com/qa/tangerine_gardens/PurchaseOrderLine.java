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
@Table (name="purchaseorderline")

public class PurchaseOrderLine {

	@Id
	@Column (name = "purchase_orderline_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private BigInteger purchaseorderline_id;
	
	@OneToMany 
	@JoinColumn(name = "product_id_fk", nullable = true)
	private int product_id_fk ;
	
	@OneToMany 
	@JoinColumn(name = "purchase_order_id_fk", nullable = true)
	private int purchase_order_id_fk ;
	
	@Column (name = "quantity")
	private int quantity;
	
	
	public PurchaseOrderLine(){}

	
	public BigInteger getPurchaseOrderline_id() {
		return purchaseorderline_id;
	}
	
	
	public int getOrderId()
	{
		return purchase_order_id_fk;
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

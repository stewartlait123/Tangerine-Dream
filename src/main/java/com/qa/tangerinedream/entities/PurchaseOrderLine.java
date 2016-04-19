/*
 * Created by Umar */
package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "purchase_order_line")
public class PurchaseOrderLine {
	
	@Id
	@Column(name = "purchase_orderline_id")
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	public long purchase_orderline_id;
	
	@Column ( name = "qty")
	public int quantity;
	
	@ManyToOne
	@JoinColumn( name = "purchase_order_id_fk", nullable = false)
	private PurchaseOrder purchase_order_id;

	public PurchaseOrderLine(int quantity, PurchaseOrder purchaseOrder) {
		this.quantity = quantity;
		this.purchase_order_id = purchaseOrder;
	}

	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int value){
		this.quantity = value;
	}
	
	public long getPurchaseOrderlineId(){
		return purchase_orderline_id;
	}
	
	public PurchaseOrder getPurchaseOrderId()
	{
		return purchase_order_id;
	}
}

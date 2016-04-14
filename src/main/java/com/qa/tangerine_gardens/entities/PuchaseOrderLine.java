package com.qa.tangerine_gardens.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "purchase_order_line")
public class PuchaseOrderLine {
	
	@Id
	@Column(name = "purchase_order_line")
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	public long purchaseorderline_id;
	
	@Column ( name = "qty")
	public int Quantity;
	
	@OneToOne
	@JoinColumn( name = "purchase_order_id", nullable = false)
	public PurchaseOrder purchaseorder_FK;
	
	public int getQuantity(){
		return Quantity;
	}
	
	public PurchaseOrder getPurchaseOrderFK(){
		return purchaseorder_FK;
	}
	
	public void setQuantity(int value){
		this.Quantity = value;
	}
	
	public void setPurchaseorderFK(PurchaseOrder value){
		this.purchaseorder_FK = value;
	}
}

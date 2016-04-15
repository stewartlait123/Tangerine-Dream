package com.qa.tangerine_gardens.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "purchase_order_line")
public class PurchaseOrderLine {
	
	@Id
	@Column(name = "purchase_order_line")
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	public long purchaseorderline_id;
	
	@Column ( name = "qty")
	public int qty;
	
	@ManyToOne
	@JoinColumn( name = "purchase_order_id", nullable = false)
	public PurchaseOrder purchaseorder_FK;
	
	public int getQty(){
		return qty;
	}
	
	public PurchaseOrder getPurchaseOrderFK(){
		return purchaseorder_FK;
	}
	
	public void setQty(int value){
		this.qty = value;
	}
	
	public void setPurchaseorderFK(PurchaseOrder value){
		this.purchaseorder_FK = value;
	}
}

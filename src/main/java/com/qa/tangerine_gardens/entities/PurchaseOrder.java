/*
 * Created by Umar 
 * */
package com.qa.tangerine_gardens.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "purchaseorder")
class PurchaseOrder {
	
	@Id
	@Column (name = "purchaseorder_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long purchaseorder_id;
	
	@Column (name = "purchase_order_date")
	private Date purchaseOrderDate;
	
	@ManyToOne
	@JoinColumn( name = "employee_id" )
	private Employee employee;
	
	public long getPurchaseorder_id(){
		return purchaseorder_id;
	}
	
	public Date getPurchaseOrderDate(){
		return purchaseOrderDate;
	}
	
	public Employee getEmployee(){
		return employee;
	}
	
	public void setPurchaseOrderDate(Date value){
		this.purchaseOrderDate = value;
	}
	
	public void setEmployee(Employee value)
	{
		this.employee = value;
	}
} 


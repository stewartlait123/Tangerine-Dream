/*
 * Created by Umar 
 * */
package com.qa.tangerinedream.entities;

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
public class PurchaseOrder {
	
	@Id
	@Column (name = "purchaseorder_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long purchaseorder_id;
	
	@Column (name = "purchase_order_date")
	private Date purchaseOrderDate;
	
	@ManyToOne
	@JoinColumn( name = "employee_id" )
	private Employee employee;
	
	public PurchaseOrder(java.util.Date currentDate, Employee employee2) {
		// TODO Auto-generated constructor stub
	}

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


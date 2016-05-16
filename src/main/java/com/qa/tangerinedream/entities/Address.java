//Created by Finley Peters @ Team Tang

package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "address")
public class Address {
	@Id
	@Column (name = "address_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	long address_id;
	
	@Column (name = "billing_address",nullable = false, length=225)
	@NotNull
	@Size(min = 2, max = 225)
	String billing_address;
	
	@Column (name = "delivery_address",nullable = false, length=225)
	@NotNull
	@Size(min = 2, max = 225)
	String delivery_address;
	
	@ManyToOne
	@JoinColumn (name = "customer_id_fk")
	Customer customer;
	
	
	public Address(String deliveryAddress ,String billingAddress, Customer customer) {

		// TODO Auto-generated constructor stub
		
		this.billing_address = billingAddress;
		this.delivery_address = deliveryAddress;
		this.customer = customer;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public Customer getCustomercustomer_id() {
		return customer;
	}
	public void setCustomercustomer_id(Customer customer) {
		this.customer = customer;
	}
}

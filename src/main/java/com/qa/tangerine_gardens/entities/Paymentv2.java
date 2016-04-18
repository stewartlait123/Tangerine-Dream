package com.qa.tangerine_gardens.entities;

/** Remake of Payment entity
 * 
 * @author Stewart with help of the lovely Christine.
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity 
@Table (name = "Paymentv2")

public class Paymentv2 {
	
	@Id
	@Column (name = "payment_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int payment_id;
	
	@Column(name = "payment_type",nullable= false, length = 19)
	@NotNull
	private int payment_type;
	
	@OneToOne
	@Column (name = "order_id")	
	@JoinColumn(name = "order_id", nullable = true)
	private int order_id;
	
	@OneToMany 
	@JoinColumn(name = "address_id", nullable = true)
	private int address_id;
	
	public void Paymentv2(){}
	
	/**
	 * Gets and returns payment ID
	 */

	public int getPayment_id() {
		return payment_id;
	}

	/**
	 * Gets and returns method of payment
	 */
	public int getPayment_type() {
		return payment_type;
	}

	/**
	 * Sets the payment type
	 */
	public void setPayment_type(int payment_type) {
		this.payment_type = payment_type;
	}

	/**
	 * Gets and returns order id
	 */
	public int getOrder_id() {
		return order_id;
	}

	/**
	 * Get and returns Address id
	 */
	public int getAddress_id() {
		return address_id;
	}

	/**
	 * Sets address id
	 */
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	
	
}

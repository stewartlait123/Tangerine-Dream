package com.qa.tangerine_gardens.entities;

import java.math.BigInteger;
import java.sql.Date;

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
@Table (name="order")

public class Order {

	@Id
	@Column (name = "order_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private BigInteger order_id;
	
	@Column(name = "status", nullable = false, length = 10)
	@NotNull
	@Size (min = 1, max = 10)
	
	private int status;
	
	@Column(name = "order_date", nullable = false, length = 50)
	@NotNull
	@Size (min = 6, max = 50)
	private Date order_date;
	
	@ManyToOne
	@JoinColumn (name = "order_customer_id_fk", nullable = false)
	@NotNull
	private Customer customer_id;
	
	public Order(){}

	public BigInteger getOrder_id() {
		return order_id;
	}

	public int getStatus() {
		return status;
	}

	public Date getOrder_date() {
		return order_date;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	
	
	
	
}

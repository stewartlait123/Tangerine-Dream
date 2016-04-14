package com.qa.tangerine_gardens.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table (name="order_line")
public class Order_line {
	@Id
	@Column (name = "qty", nullable = false, length = 10)
	@NotNull
	@Size (min = 1, max = 10)
	private int qty;
	
	@OneToOne
	@JoinColumn(name = "product_id_fk", nullable = false)
	@NotNull
	private Product product_id_fk;
	
	@ManyToOne
	@JoinColumn(name = "order_id_fk", nullable = false)
	@NotNull
	private Order order_id_fk;
	
	public Order_line(){}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}

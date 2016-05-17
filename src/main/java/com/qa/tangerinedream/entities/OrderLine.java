package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Jessica Maddocks
 * @version 2.1 The Entity for the Orderline class. Christine Stokes created
 *          version 1.0.
 */

@Entity
@Table(name = "OrderLines")
public class OrderLine {
	@ManyToOne
	@JoinColumn(name = "product_fk", nullable = false)
	@Size(min = 4, max = 500)
	@NotNull
	private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OrderID")
	private Order order;

	@Column(name = "quantity", nullable = false)
	@NotNull
	private int quantity;

	@Column(name = "purchasePrice", nullable = false)
	@NotNull
	private float purchasePrice;
	
	public OrderLine() {}

	// constructor for attributes
	public OrderLine(Product product, int quantity, float purchasePrice) {
		this.product = product;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
	}
	
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public void setOrder(Order order) {
		this.order = order;
		if (!order.getOrderLines().contains(this))
			order.addOrderLine(this);
	}

	public Order getOrder() {
		return order;
	}

	@Override
	public String toString() {
		return "OrderLine [product=" + product + ", quantity=" + quantity + ", purchasePrice=" + purchasePrice
				+ ", order=" + order + "]";
	}

}
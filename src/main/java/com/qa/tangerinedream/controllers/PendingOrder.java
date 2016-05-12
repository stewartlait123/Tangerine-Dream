package com.qa.tangerinedream.controllers;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import com.qa.tangerinedream.entities.Order;

@ManagedBean
@SessionScoped
public class PendingOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4539976728062002297L;

	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
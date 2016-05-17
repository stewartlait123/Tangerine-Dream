/*Author Jessica M */
package com.qa.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;

import repositorybackend.OrderStatus;

public class OrderLineTest {
OrderLine orderline = new OrderLine(new Product("jdskj", 1, 32, 333 , 33, 2, 1, 33, "jhcsj", "kdsg", "gg"), 3, 3212);
Order order = new Order(0, OrderStatus.ACCEPTED, null, null, new OrderLine());

	@Test
	public void testGetProduct() {
		assertEquals("jdskj", orderline.getProduct().getName());
	}

	@Test
	public void testGetQuantity() {
		assertEquals(3, orderline.getQuantity());
	}

	@Test
	public void testGetPurchasePrice() {
		assertEquals(3212, orderline.getPurchasePrice(), 0.01);
	}

	@Test
	public void testSetProduct() {
		orderline.setProduct(new Product(1, "name", 2, 3, 4, 5, 6, 1, 2, "gnome", "location", "description"));
		assertEquals("name" , orderline.getProduct().getName());
	}

	@Test
	public void testSetQuantity() {
		orderline.setQuantity(2);
		assertEquals(2, orderline.getQuantity());
	}

	@Test
	public void testSetPurchasePrice() {
		orderline.setPurchasePrice(3);
		assertEquals(3, orderline.getPurchasePrice(), 0.01);
	}

	@Test
	public void testOrderLineProductIntInt() {
		OrderLine orderline = new OrderLine(new Product(), 1, 2);
		assertNotNull(orderline.getProduct());
	}

	@Test
	public void testOrderLineProductIntString() {
		OrderLine orderline = new OrderLine(new Product(), 1, 1);
		assertNotNull(orderline.getProduct());	
	}

	@Test
	public void testOrderLine() {
		OrderLine orderline = new OrderLine();
		assertNull(orderline.getOrder());
	}
	
	@Test
	public void testGetOrder() {
		orderline.setOrder(order);
		assertEquals(order.getOrder_id(), orderline.getOrder());
	}
	
	@Test
	public void testSetOrder() {
		orderline.setOrder(new Order());
		assertEquals(order.getOrder_id(), orderline.getOrder());
	}
}

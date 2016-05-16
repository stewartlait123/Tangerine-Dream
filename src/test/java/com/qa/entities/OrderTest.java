package com.qa.entities;

import static org.junit.Assert.*;

import java.util.Calendar;
import org.junit.Test;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;

import repositorybackend.OrderStatus;

public class OrderTest {
	Order order = new Order(1, OrderStatus.ACCEPTED, Calendar.getInstance().getTime(), new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 10, 10), new OrderLine(new Product(1, "pname", 5, 6, 2, 3, 7, 1, 8, "Trpe", "imageLocation", "description"), 3, 9));

	@Test
	public void testOrder() {
		Order order = new Order();
		assertNull(order.getCustomer());
	}

	@Test
	public void testOrderCustomerOrderStatus() {
		Order order = new Order(null, OrderStatus.ACCEPTED);
		assertNotNull(order.getStatus());
	}

	@Test
	public void testOrderLongOrderStatusDateCustomerOrderLine() {
		Order order = new Order(0, OrderStatus.ACCEPTED, null, null, null);
		assertNotNull(order.getStatus());
	}

	@Test
	public void testGetOrder_id() {
		assertEquals(1, order.getOrder_id());
	}

	@Test
	public void testSetorder_id() {
		order.setorder_id(2);
		assertEquals(2, order.getOrder_id());
	}

	@Test
	public void testGetStatus() {
		assertEquals(OrderStatus.ACCEPTED, order.getStatus());
	}

	@Test
	public void testGetOrder_date() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStatus() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOrder_date() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrderLines() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOrderLines() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddOrderLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveOrderLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateOrderLine() {
		fail("Not yet implemented");
	}

}

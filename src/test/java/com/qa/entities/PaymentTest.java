/*
 * @author: Iain Q
 */

package com.qa.entities;

import static org.junit.Assert.*;

import java.util.Calendar;

import com.qa.tangerinedream.entities.Address;
import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Payment;
import com.qa.tangerinedream.entities.Product;

import repositorybackend.OrderStatus;

import org.junit.Test;

public class PaymentTest {

	
	Customer customer = new Customer("testname","testusername","testpassword",Calendar.getInstance().getTime(),1,1);
	Address address = new Address("testbilladdress", "testdeliveraddress", customer);
	Order order = new Order(1, OrderStatus.ACCEPTED, Calendar.getInstance().getTime(), new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 10, 10), new OrderLine(new Product(1, "pname", 5, 6, 2, 3, 7, 1, 8, "Trpe", "imageLocation", "description"), 3, 9));
	Payment payment = new Payment(1,order,address,customer);
	
	@Test
	public void testPayment() {
		Payment payment = new Payment(1,order,null,null);
		assertNull(payment.getAddress_id());
	}

	@Test
	public void testGetPayment_id() {
		Payment payment = new Payment(1,order,null,null);
		assertNotNull(payment.getPayment_id());
	}

	@Test
	public void testGetPayment_type() {
		Payment payment = new Payment(1,order,null,null);
		assertNotNull(payment.getPayment_type());
	}

	@Test
	public void testSetPayment_type() {
		payment.setPayment_type(2);
		assertEquals(2, payment.getPayment_type());
	}

	@Test
	public void testGetOrder_id() {
		assertEquals(1, payment.getOrder_id().getOrder_id());
	}



}

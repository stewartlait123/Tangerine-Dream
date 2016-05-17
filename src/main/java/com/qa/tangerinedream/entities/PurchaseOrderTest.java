package com.qa.tangerinedream.entities;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PurchaseOrderTest {
	
	PurchaseOrder purchaseOrder = new PurchaseOrder(new Date(), new Employee("", 0, 0, false));
	
	@Test
	public void testPurchaseOrderDateEmployee() {
		PurchaseOrder purchaseOrder = new PurchaseOrder(new Date(), new Employee("", 0, 0, false));
		assertNotNull(purchaseOrder);
	}

	@Test
	public void testPurchaseOrderDateEmployee1() {
		PurchaseOrder purchaseOrder = new PurchaseOrder(new java.sql.Date(0), new Employee("", 0, 0, false));
		assertNotNull(purchaseOrder);
	}

	@Test
	public void testGetPurchaseorder_id() {
		assertNotNull(purchaseOrder.getPurchaseorder_id());
	}

	@Test
	public void testGetPurchaseOrderDate() {
		assertNotNull(purchaseOrder.getPurchaseOrderDate());
	}

	@Test
	public void testGetEmployee() {
		assertNotNull(purchaseOrder.getEmployee());
	}

	@Test
	public void testSetPurchaseOrderDate() {

		//Did not simply want to create a new date for today, as it would not be different to the date
		//initially set for the customer on creation. I hate java date objects.
		SimpleDateFormat formatter = new SimpleDateFormat("30-07-1988");
		String dateInString = "7-Jun-2013";
		java.sql.Date date = null;
		try {

			date = (java.sql.Date) formatter.parse(dateInString);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		purchaseOrder.setPurchaseOrderDate(date);
		assertEquals(date, purchaseOrder.getPurchaseOrderDate());
	}

	@Test
	public void testSetEmployee() {
		purchaseOrder.setEmployee(new Employee("Big Bouncy Ben", 1,1,true));
		assertEquals(new Employee("Big Bouncy Ben", 1,1,true), purchaseOrder.getEmployee());
	}

}

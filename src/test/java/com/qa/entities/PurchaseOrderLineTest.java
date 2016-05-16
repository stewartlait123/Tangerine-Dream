package com.qa.entities;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.qa.tangerinedream.entities.Employee;
import com.qa.tangerinedream.entities.PurchaseOrder;
import com.qa.tangerinedream.entities.PurchaseOrderLine;

public class PurchaseOrderLineTest {
	
	PurchaseOrderLine purchaseOrderLine = new PurchaseOrderLine(1, new PurchaseOrder(new Date(), new Employee("name", 1, 1, true)));

	@Test
	public void testPurchaseOrderLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetQuantity() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetQuantity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPurchaseOrderlineId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPurchaseOrderId() {
		fail("Not yet implemented");
	}

}

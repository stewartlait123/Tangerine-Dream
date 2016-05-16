package com.qa.entities;

import static org.junit.Assert.*;


import com.qa.tangerinedream.entities.Supplier;
import org.junit.Test;

public class SupplierTest {
	Supplier supplier = new Supplier(1, true);
		
		
	
	@Test
	public void testGetId() {
		assertEquals(1, supplier.getId());
	}

	@Test
	public void testSetActive() {
		supplier.setActive(false);
		assertEquals(false, supplier.getActive());
		
	}
	@Test
	public void testSupplier() {
		Supplier supplier = new Supplier(1, false);
		assertNotNull(supplier.getId());
		
	}

}

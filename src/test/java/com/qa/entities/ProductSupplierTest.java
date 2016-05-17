/*
 * @author: Iain Q
 */

package com.qa.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.entities.ProductSupplier;
import com.qa.tangerinedream.entities.Supplier;

public class ProductSupplierTest {

	ProductSupplier productsupplier = new ProductSupplier(new Supplier(0, false), new Product(), 0);
	
	@Test
	public void testProductSupplier() {
		ProductSupplier productsupplier = new ProductSupplier(null, null, 0);
		assertNotNull(productsupplier);
	}

	@Test
	public void testGetPsupplier_id() {
		assertNotNull(productsupplier.getPsupplier_id());
	}

	@Test
	public void testSetCost() {
		productsupplier.setCost(5);
		assertEquals(5,productsupplier.getCost());
	}

	@Test
	public void testGetCost() {
		assertNotNull(productsupplier.getCost());
	}

	@Test
	public void testGetSupplier() {
		assertNotNull(productsupplier.getSupplier());
	}

	@Test
	public void testGetProduct() {
		assertNotNull(productsupplier.getProduct());
	}

	@Test
	public void testSetSupplier() {
		Supplier supplier = new Supplier(0,false);
		productsupplier.setSupplier(supplier);
		assertEquals(supplier,productsupplier.getSupplier());
	}

	@Test
	public void testSetProduct() {
		Product product = new Product();
		productsupplier.setProduct(product);
		assertEquals(product,productsupplier.getProduct());
	}

}

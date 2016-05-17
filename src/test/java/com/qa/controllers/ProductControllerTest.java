/*
 * @author: Iain Q
 */

package com.qa.controllers;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.controllers.ProductController;


public class ProductControllerTest {

	ProductController pc = new ProductController();
	
	@Test
	public void testGetName() {
		assertNotNull(pc.getName());
	}

	@Test
	public void testGetDescription() {
		assertNotNull(pc.getDescription());
	}

	@Test
	public void testGetCost() {
		assertNotNull(pc.getCost());
	}

	@Test
	public void testGetSize() {
		assertNotNull(pc.getSize());
	}

	@Test
	public void testGetWeight() {
		assertNotNull(pc.getWeight());
	}

	@Test
	public void testGetMinStock() {
		assertNotNull(pc.getMinStock());
	}

	@Test
	public void testGetOrderAmount() {
		assertNotNull(pc.getOrderAmount());
	}

	@Test
	public void testSetStock() {
		pc.setStock(5);
		assertEquals(5,pc.getStock());
	}

	@Test
	public void testGetproduct_id() {
		assertNotNull(pc.getproduct_id());
	}

	@Test
	public void testGetPrice() {
		assertNotNull(pc.getPrice());
	}

	@Test
	public void testGetproduct_type() {
		assertNotNull(pc.getproduct_type());
	}

	@Test
	public void testGetImageLocation() {
		assertNotNull(pc.getImageLocation());
	}

	@Test
	public void testGetStock() {
		assertNotNull(pc.getStock());
	}

	@Test
	public void testSetName() {
		pc.setName("test");
		assertEquals("test",pc.getName());
	}

	@Test
	public void testSetDescription() {
		pc.setDescription("test");
		assertEquals("test",pc.getDescription());
	}


	@Test
	public void testSetproduct_id() {
		pc.setproduct_id(1);
		assertEquals(1,pc.getproduct_id());
	}

	@Test
	public void testSetPrice() {
		pc.setPrice(1);
		assertEquals(1,pc.getPrice());
	}

	@Test
	public void testSetProduct_type() {
		pc.setProduct_type("test");
		assertEquals("test",pc.getproduct_type());
	}

	@Test
	public void testSetImageLocation() {
		pc.setImageLocation("test");
		assertEquals("test",pc.getImageLocation());
	}

	@Test
	public void testSetCost_price() {
		pc.setCost_price(1);
		assertEquals(1,pc.getCost());
	}

	@Test
	public void testSetSize() {
		pc.setSize(1);
		assertEquals(1,pc.getSize());
	}

	@Test
	public void testSetWeight() {
		pc.setWeight(1);
		assertEquals(1,pc.getWeight());
	}

	@Test
	public void testSetMinStock() {
		pc.setMinStock(1);
		assertEquals(1,pc.getMinStock());
	}

	@Test
	public void testSetOrderAmount() {
		pc.setOrderAmount(1);
		assertEquals(1,pc.getOrderAmount());
	}

}

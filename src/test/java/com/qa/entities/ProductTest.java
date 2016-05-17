package com.qa.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.tangerinedream.entities.Product;

public class ProductTest {
	Product product = new Product((long)1, "Pot", 50, 100, 10, 100, 1000, 1000, 1000, "POT", "img/pot-plastic.jpg", "Standard pot");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduct() {
		Product product = new Product();
		assertNotNull(product);
	}

	@Test
	public void testProductStringIntIntIntIntIntIntIntStringStringString() {
		product = new Product("Pot", 50, 100, 10, 100, 1000, 1000, 1000, "POT", "img/pot-plastic.jpg", "Standard pot");
		assertNotNull(product);
	}

	@Test
	public void testProductLongStringIntIntIntIntIntIntIntStringStringString() {
		product = new Product((long)1, "Pot", 50, 100, 10, 100, 1000, 1000, 1000, "POT", "img/pot-plastic.jpg", "Standard pot");
		assertNotNull(product);
	}

	@Test
	public void testGetProduct_id() {
		assertNotNull(product.getProduct_id());
	}

	@Test
	public void testGetName() {
		assertNotNull(product.getName());
	}

	@Test
	public void testGetCost_price() {
		assertNotNull(product.getCost_price());
	}

	@Test
	public void testGetPrice() {
		assertNotNull(product.getPrice());
	}

	@Test
	public void testGetSize() {
		assertNotNull(product.getSize());
	}

	@Test
	public void testGetWeight() {
		assertNotNull(product.getWeight());
	}

	@Test
	public void testGetStock() {
		assertNotNull(product.getStock());
	}

	@Test
	public void testGetMin_stock() {
		assertNotNull(product.getMin_stock());
	}

	@Test
	public void testGetOrder_amount() {
		assertNotNull(product.getOrder_amount());
	}

	@Test
	public void testGetProduct_type() {
		assertNotNull(product.getProduct_type());
	}

	@Test
	public void testGetImageLocation() {
		assertNotNull(product.getImageLocation());
	}

	@Test
	public void testGetQuantity() {
		assertNotNull(product.getQuantity());
	}

	@Test
	public void testGetDescription() {
		assertNotNull(product.getDescription());
	}

	@Test
	public void testSetName() {
		product.setName("test");
		assertEquals("test", product.getName());
	}

	@Test
	public void testSetCost_price() {
		product.setCost_price(1);
		assertEquals(1, product.getCost_price());
	}

	@Test
	public void testSetPrice() {
		product.setPrice(1);
		assertEquals(1, product.getPrice());
	}

	@Test
	public void testSetSize() {
		product.setSize(1);
		assertEquals(1, product.getSize());
	}

	@Test
	public void testSetWeight() {
		product.setWeight(1);
		assertEquals(1, product.getWeight());
	}

	@Test
	public void testSetStock() {
		product.setStock(1);
		assertEquals(1, product.getStock());
	}

	@Test
	public void testSetMin_stock() {
		product.setMin_stock(1);
		assertEquals(1, product.getMin_stock());
	}

	@Test
	public void testSetOrder_amount() {
		product.setOrder_amount(1);
		assertEquals(1, product.getOrder_amount());
	}

	@Test
	public void testSetProduct_type() {
		product.setProduct_type("test");
		assertEquals("test", product.getProduct_type());
	}

	@Test
	public void testSetImageLocation() {
		product.setImageLocation("test");
		assertEquals("test", product.getImageLocation());
	}

	@Test
	public void testSetQuantity() {
		product.setQuantity(1);
		assertEquals(1, product.getQuantity());
	}

}

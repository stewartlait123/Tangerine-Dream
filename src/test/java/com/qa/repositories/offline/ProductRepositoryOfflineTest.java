/**
 * @author: Iain Q 
 */
package com.qa.repositories.offline;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.junit.Test;

import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.offline.ProductRepositoryOffline;

/**
 * @author Iain Q
 *
 */
public class ProductRepositoryOfflineTest {

	Product product = new Product(1, "name", 2, 3, 4, 5, 6, 7, 8, "GNOME", "Image", "Description");
	ArrayList<Product> productList = new ArrayList<Product>(Arrays.asList(product));
	ProductRepositoryOffline productRepo;

	@PostConstruct
	public void initialProductRepo()
	{
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
	}
	

	@Test
	public void testFindByProductId() {	
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		assertNotNull(productRepo.findByProductId(1));
	}


	@Test
	public void testGetProducts() {
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		assertNotNull(productRepo.getProducts());
	}


	@Test
	public void testUpdateProduct() {
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		//product.setName("test");
		productRepo.updateProduct(product);
		assertEquals("test",productRepo.findByProductId(product.getProduct_id()).getName());
		
		
		///FIX
	}


	@Test
	public void testRemoveProduct() {
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		productRepo.removeProduct(product);
		assertEquals(new ArrayList<Product>(),productRepo.getProducts());
	}


	@Test
	public void testAddProduct() {
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		assertNotNull(productRepo.getProducts());
	}


	@Test
	public void testFindByProductType() {
		productRepo = mock(ProductRepositoryOffline.class);
		productRepo.addProduct(product);
		assertNotNull(productRepo.findByProductType("GNOME"));
	}

}

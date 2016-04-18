<<<<<<< HEAD:src/main/java/com/qa/tangerine_gardens/repositories/ProductRepository.java
package com.qa.tangerine_gardens.repositories;
=======
// Created by Mohammed Miah
package com.qa.tangerine_gardens.entities;
>>>>>>> 94f8133af6097cff3ecfc3a1e85be6a5642560ec:src/main/java/com/qa/tangerine_gardens/entities/ProductRepository.java

import java.util.ArrayList;

import com.qa.tangerine_gardens.entities.Product;

public interface ProductRepository{
	public void persistProduct(Product p);
	public void persistProducts(ArrayList<Product> p);
	
	public Product findByProductId(long id);
	public ArrayList<Product> getProducts();
	
	public void updateProduct(Product p);
	public void removeProduct(Product p);
	public void addProduct(Product p);
}
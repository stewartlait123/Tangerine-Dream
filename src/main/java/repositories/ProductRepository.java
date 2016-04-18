package repositories;

import java.util.ArrayList;

import entities.Product;

public interface ProductRepository{
	public void persistProduct(Product p);
	public void persistProducts(ArrayList<Product> p);
	
	public Product findByProductId(long id);
	public ArrayList<Product> getProducts();
	
	public void updateProduct(Product p);
	public void removeProduct(Product p);
	public void addProduct(Product p);
}
package com.qa.tangerinedream.repositories;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.ProductSupplier;

public interface ProductSupplierRepository {
	public void persistProductSupplier (ProductSupplier p);
	public void persistProductSuppliers(
			List<ProductSupplier> p);
	public ProductSupplier findById(int id);
	public void removeProductSupplier (ProductSupplier p);
	public ArrayList<ProductSupplier> getProductSuppliers();
	void updateProductSupplier(ProductSupplier ps);

}
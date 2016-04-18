package com.qa.tangerine_gardens.entities;

/**
 * This is the ProductSupplier repository
 * 
 * @author Iain Q
 *
 */

import java.util.ArrayList;
import java.util.List;

public interface ProductSupplierRepository {
	public void persistProductSupplier (ProductSupplier p);
	public void persistProductSuppliers(
			List<ProductSupplier> p);
	public ProductSupplier findById(int id);
	public void removeProductSupplier (ProductSupplier p);
	public ArrayList<ProductSupplier> getProductSuppliers(ProductSupplier ps);
	void updateProductSupplier(ProductSupplier ps);

}
package com.qa.tangerine_gardens.repositories;

/**
 * This is the ProductSupplier repository
 * 
 * @author Iain Q
 *
 */

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import com.qa.tangerine_gardens.entities.ProductSupplier;

public interface ProductSupplierRepository {
	public void persistProductSupplier (ProductSupplier p);
	public void persistProductSuppliers(
			List<ProductSupplier> p);
	public ProductSupplier findById(int id);
	public void removeProductSupplier (ProductSupplier p);
	public ArrayList<ProductSupplier> getProductSuppliers();
	public void updateCost(Currency c);

}
package com.qa.tangerine_gardens.repositories;

/**
 * This is the Supplier repository
 * 
 * @author Iain Q
 *
 */


import java.util.ArrayList;
import java.util.List;

import com.qa.tangerine_gardens.entities.Supplier;

public interface SupplierRepository {
	public void persistSupplier (Supplier s);
	public void persistSuppliers(
			List<Supplier> s);
	public Supplier findById(int id);
	public ArrayList<Supplier> getSuppliers();
	public void removeSupplier (Supplier s);
	
}
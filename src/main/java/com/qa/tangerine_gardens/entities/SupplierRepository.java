package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;
import java.util.List;

public interface SupplierRepository {
	public void persistSupplier (Supplier s);
	public void persistSuppliers(
			List<Supplier> s);
	public Supplier findById(int id);
	public ArrayList<Supplier> getSuppliers();
	public void removeSupplier (Supplier s);
	
}
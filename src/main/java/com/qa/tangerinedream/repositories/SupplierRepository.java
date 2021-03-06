package com.qa.tangerinedream.repositories;

/**
 * This is the Supplier repository
 * 
 * @author Duncan Gillespie
 *
 */


import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.Supplier;

public interface SupplierRepository {
	public void persistSupplier (Supplier s);
	public void persistSuppliers(List<Supplier> s);
	public Supplier find(int id);
	public ArrayList<Supplier> getSuppliers();
	public void remove (Supplier s);
}
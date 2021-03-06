package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.Supplier;
import com.qa.tangerinedream.repositories.SupplierRepository;

/**
 * @author Duncan Gillespie 
 *
 */

public class SupplierOfflineImplementation implements SupplierRepository{
	ArrayList<Supplier> suppliers;
	
	@Override
	public void persistSupplier(Supplier s) {
		suppliers.add(s);
	}

	@Override
	public void persistSuppliers(List<Supplier> s) {
		suppliers.addAll(s);
	}

	@Override
	public Supplier find(int id) {
		return suppliers.get(id);
	}

	@Override
	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	@Override
	public void remove(Supplier s) {
		suppliers.remove(s.getId());
	}

}

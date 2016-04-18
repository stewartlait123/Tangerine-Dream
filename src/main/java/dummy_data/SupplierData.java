package dummy_data;

/**
 * This is dummy data for the Supplier
 * 
 * @author Iain Q
 *
 */

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import entities.Supplier;

@Singleton
public class SupplierData {
	
	private ArrayList<Supplier> Suppliers =
			new ArrayList<Supplier>();
	
	public SupplierData() {
		//no data other than auto-generated id
		Suppliers.add(new Supplier());
		Suppliers.add(new Supplier());
	}
	
	public List<Supplier> getSuppliers(){
		return Suppliers;
	}
	
	public void addSupplier(Supplier Supplier) {
		Suppliers.add(Supplier);
	}
	public void setSuppliers(List<Supplier> Supplier) {
		Suppliers = (ArrayList<Supplier>) Supplier;
	}
}
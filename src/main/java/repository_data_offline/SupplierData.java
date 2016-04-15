package repository_data_offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import com.qa.tangerine_gardens.entities.Supplier;

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
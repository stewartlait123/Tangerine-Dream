package entities;

/**
 * This is the Supplier repository
 * 
 * @author Duncan Gillespie
 *
 */


import java.util.ArrayList;
import java.util.List;

public interface SupplierRepository {
	public void persistSupplier (Supplier s);
	public void persistSuppliers(List<Supplier> s);
	public Supplier find(int id);
	public ArrayList<Supplier> getSuppliers();
	public void remove (Supplier s);
}
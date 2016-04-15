package repository_data_offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import com.qa.tangerine_gardens.entities.ProductSupplier;

@Singleton
public class ProductSupplierData {
	private ArrayList<ProductSupplier> ProductSuppliers =
				new ArrayList<ProductSupplier>();
	
	public ProductSupplierData() {
		ProductSuppliers.add(new ProductSupplier());
		ProductSuppliers.add(new ProductSupplier());
	}
	
	public List<ProductSupplier> getProductSuppliers(){
		return ProductSuppliers;
	}
	
	public void addProductSupplier(ProductSupplier ProductSupplier) {
		ProductSuppliers.add(ProductSupplier);
	}
	
	public void setProductSuppliers(List<ProductSupplier> ProductSupplier) {
		ProductSuppliers = (ArrayList<ProductSupplier>) ProductSupplier;
	}
	
	
	
}
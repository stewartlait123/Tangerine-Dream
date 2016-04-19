package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.ProductSupplier;
import com.qa.tangerinedream.repositories.ProductSupplierRepository;

import repositorybackend.*;

/**
 * This is the offline ProductSupplier repository
 * 
 * @author Iain Q
 * 
 */

public class ProductSupplierRepositoryOffline implements ProductSupplierRepository {
	
		@Inject
		private InitialData initialData;
		
		@Override
		public void persistProductSupplier(ProductSupplier ps) {
			initialData.addProductSupplier(ps);
		}
		
		@Override
		public void persistProductSuppliers(List<ProductSupplier> ps) {
			initialData.setProductSupplier(ps);	
		}
		
		@Override
		public ArrayList<ProductSupplier> getProductSuppliers() {
			return initialData.getProductSuppliers();
		}
		
		
		@Override
		public void updateProductSupplier(ProductSupplier ps) {
			ArrayList<ProductSupplier> aps =
			initialData.getProductSuppliers();
			for(int i=0; i<aps.size(); i++) {
				if(aps.get(i).equals(ps))
				aps.set(i, ps);
			}
			initialData.setProductSupplier(aps);
		}
		
		@Override
		public void removeProductSupplier(ProductSupplier ps) {
			ArrayList<ProductSupplier> aps =
			initialData.getProductSuppliers();
			for(int i=0; i<aps.size(); i++) {
				if(aps.get(i).equals(ps))
				aps.remove(i);
			}
			initialData.setProductSupplier(aps);
		}


		@Override
		public ProductSupplier findById(int id) {
			return initialData.getProductSupplier(id);
		}

		@Override
		public void updateCost(Currency c) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ArrayList<ProductSupplier> getProductSupplier(ProductSupplier ps) {
			// TODO Auto-generated method stub
			return null;
		}


}
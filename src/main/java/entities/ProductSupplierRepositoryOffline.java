package com.qa.tangerine_gardens.repository;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.inject.Inject;

import repositories.*;
import entities.*;
import dummy_data.InitialData;

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
			initialData.getProductSupplier(ps);	
		}
		
		@Override
		public ArrayList<ProductSupplier> getProductSuppliers(ProductSupplier ps) {
			return initialData.getEntityList(ps);
		}
		
		
		@Override
		public void updateProductSupplier(ProductSupplier ps) {
			ArrayList<ProductSupplier> aps =
			initialData.getProductSuppliers();
			for(int i=0; i<aps.size(); i++) {
				if(aps.get(i).equals(ps))
				aps.set(i, ps);
			}
			initialData.setProductSuppliers(aps);
		}
		
		@Override
		public void removeProductSupplier(ProductSupplier ps) {
			ArrayList<ProductSupplier> aps =
			initialData.getProductSuppliers();
			for(int i=0; i<aps.size(); i++) {
				if(aps.get(i).equals(ps))
				aps.remove(i);
			}
			initialData.setProductSuppliers(aps);
		}


		@Override
		public ProductSupplier findById(int id) {
			return initialData.getProductSupplier(id);
		}


}
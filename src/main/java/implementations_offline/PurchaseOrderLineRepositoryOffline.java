/*
 * Created by Umar */
package implementations_offline;

import java.util.ArrayList;

import javax.inject.Inject;

import repositories.PurchaseOrderLineRepository;
import entities.*;
import dummy_data.InitialData;

public class PurchaseOrderLineRepositoryOffline implements PurchaseOrderLineRepository {
	
	@Inject
	private InitialData initialData;
	
	public void persistPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
		initialData.addPurchaseOrderLine(purchaseOrderLine);
	}
	
	@Override
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id){
		return null;
	}
	
	@Override
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines(long id){
		return null;
	}
	
	@Override
	public void updatePurchaseOrderLine(PurchaseOrderLine p){
		
	}
	
	@Override
	public void removePurchaseOrderLine(PurchaseOrderLine p){
		
	}
	
	@Override
	public void addPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
		
	}
}

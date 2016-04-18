/*
 * Created by Umar */
package repository_data_offline;

import java.util.ArrayList;

import javax.inject.Inject;

import com.qa.tangerine_gardens.entities.PurchaseOrderLine;
import com.qa.tangerine_gardens.entities.PurchaseOrderLineRepository;
import com.qa.tangerine_gardens.repository.InitialData;

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

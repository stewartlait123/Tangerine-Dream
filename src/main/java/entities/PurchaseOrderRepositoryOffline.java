/*
 * Created by Umar
 * */
package entities;

import java.util.ArrayList;

import javax.ejb.Singleton;
import javax.inject.Inject;

import dummy_data.InitialData;

@Singleton
public class PurchaseOrderRepositoryOffline implements PurchaseOrderRepository {
	@Inject
	private InitialData initialData;
	
	public void persistPurchaseOrder(PurchaseOrder purchaseOrder){
		initialData.addPurchaseOrder(purchaseOrder);
	}
	
	@Override
	public PurchaseOrder findByPurchaseOrderId(long id){
		
		ArrayList<PurchaseOrder> purchaseOrderList = initialData.getPurchaseOrders();
		
		for (int i = 0; i < purchaseOrderList.size(); i++){
			if (purchaseOrderList.get(i).getPurchaseorder_id() == id){
				return purchaseOrderList.get(i);
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<PurchaseOrder> getPurchaseOrders(){
		return initialData.getPurchaseOrders();
	}
	
	@Override
	public void updatePurchaseOrder(PurchaseOrder p){
		ArrayList<PurchaseOrder> purchaseOrderList = initialData.getPurchaseOrders();
		
		for (int i = 0; i < purchaseOrderList.size(); i++) {
			if (purchaseOrderList.get(i).getPurchaseorder_id() == p.getPurchaseorder_id()){
				purchaseOrderList.set(i, p);
				initialData.setPurchaseOrders(purchaseOrderList);
				break;
			}
		}
	}
	
	@Override
	public void removePurchaseOrder(PurchaseOrder p){
		ArrayList<PurchaseOrder> purchaseOrderList = initialData.getPurchaseOrders();
		
		for (int i = 0; i < purchaseOrderList.size(); i++){
			if (purchaseOrderList.get(i).getPurchaseorder_id() == p.getPurchaseorder_id()){
				purchaseOrderList.remove(i);
			}
		}
	}
	
	@Override
	public void addPurchaseOrder(PurchaseOrder purchaseOrder){
		initialData.addPurchaseOrder(purchaseOrder);
	}
}

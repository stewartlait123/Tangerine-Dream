/*
 * Created by Umar */
package com.qa.tangerine_gardens.repositories;

import java.util.ArrayList;

import com.qa.tangerine_gardens.entities.PurchaseOrder;

public interface PurchaseOrderRepository {
	
	public void persistPurchase(PurchaseOrder p);
	public void persistPurchaseOrders(ArrayList<PurchaseOrder> p);
	
	public PurchaseOrder findByPurchaseOrderId(long id);
	public ArrayList<PurchaseOrder> getPurchaseOrder();
	
	public void updatePuchaseOrder(PurchaseOrder p);
	public void removePurchaseOrder(PurchaseOrder p);
	public void addPurchaseOrder(PurchaseOrder p);
	
}

/*
 * Created by Umar */
package com.qa.tangerinedream.repositories;

import java.util.ArrayList;

import com.qa.tangerinedream.entities.PurchaseOrder;

public interface PurchaseOrderRepository {
	
	public void persistPurchaseOrder(PurchaseOrder p);
	
	public PurchaseOrder findByPurchaseOrderId(long id);
	public ArrayList<PurchaseOrder> getPurchaseOrders();
	
	public void updatePurchaseOrder(PurchaseOrder p);
	public void removePurchaseOrder(PurchaseOrder p);
	public void addPurchaseOrder(PurchaseOrder p);
}

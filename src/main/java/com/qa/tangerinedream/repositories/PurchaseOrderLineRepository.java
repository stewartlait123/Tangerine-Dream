/*
 * Created by Umar */
package com.qa.tangerinedream.repositories;


import java.util.ArrayList;

import com.qa.tangerinedream.entities.PurchaseOrderLine;

public interface PurchaseOrderLineRepository {
	public void persistPurchaseOrderLine(PurchaseOrderLine p);
	
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id);
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines(long id);
	
	public void updatePurchaseOrderLine(PurchaseOrderLine p);
	public void removePurchaseOrderLine(PurchaseOrderLine p);
	public void addPurchaseOrderLine(PurchaseOrderLine p);
}

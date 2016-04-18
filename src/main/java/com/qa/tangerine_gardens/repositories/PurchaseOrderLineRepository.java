/*
 * Created by Umar */
package com.qa.tangerine_gardens.repositories;

import java.util.ArrayList;

import com.qa.tangerine_gardens.entities.PurchaseOrder;
import com.qa.tangerine_gardens.entities.PurchaseOrderLine;

public interface PurchaseOrderLineRepository {
	public void persistPurchaseOrderLine(PurchaseOrderLine p);
	public void persistPurchaseOrderLines(ArrayList<PurchaseOrderLine> p);
	
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id);
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines(long id);
	
	public void updatePuchaseOrderLine(PurchaseOrderLine p);
	public void removePurchaseOrderLine(PurchaseOrderLine p);
	public void addPurchaseOrderLine(PurchaseOrder p);
}

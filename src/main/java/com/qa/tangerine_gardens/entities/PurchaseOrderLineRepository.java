package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;

public interface PurchaseOrderLineRepository {
	public void persistPurchaseOrderLine(PurchaseOrderLine p);
	public void persistPurchaseOrderLines(ArrayList<PurchaseOrderLine> p);
	
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id);
	public ArrayList<PurchaseOrderLine> findByPurchaseOrderLines(long id);
	public ArrayList<PurchaseOrderLine> getPurchaseOrder();
	
	public void updatePuchaseOrderLine(PurchaseOrderLine p);
	public void removePurchaseOrderLine(PurchaseOrderLine p);
	public void addPurchaseOrderLine(PurchaseOrder p);
}

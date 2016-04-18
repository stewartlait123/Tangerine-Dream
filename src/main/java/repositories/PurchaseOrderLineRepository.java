/*
 * Created by Umar */
package repositories;

import entities;

import java.util.ArrayList;

import entities.PurchaseOrder;
import entities.PurchaseOrderLine;

public interface PurchaseOrderLineRepository {
	public void persistPurchaseOrderLine(PurchaseOrderLine p);
	public void persistPurchaseOrderLines(ArrayList<PurchaseOrderLine> p);
	
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id);
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines(long id);
	
	public void updatePuchaseOrderLine(PurchaseOrderLine p);
	public void removePurchaseOrderLine(PurchaseOrderLine p);
	public void addPurchaseOrderLine(PurchaseOrder p);
}

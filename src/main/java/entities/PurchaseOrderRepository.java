/*
 * Created by Umar */
package entities;

import java.util.ArrayList;

public interface PurchaseOrderRepository {
	
	public void persistPurchaseOrder(PurchaseOrder p);
	
	public PurchaseOrder findByPurchaseOrderId(long id);
	public ArrayList<PurchaseOrder> getPurchaseOrders();
	
	public void updatePurchaseOrder(PurchaseOrder p);
	public void removePurchaseOrder(PurchaseOrder p);
	public void addPurchaseOrder(PurchaseOrder p);
}

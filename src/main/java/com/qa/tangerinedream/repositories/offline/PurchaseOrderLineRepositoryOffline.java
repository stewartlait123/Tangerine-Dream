/*
 * Created by Umar */
package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.PurchaseOrderLine;
import com.qa.tangerinedream.repositories.PurchaseOrderLineRepository;

import repositorybackend.*;

public class PurchaseOrderLineRepositoryOffline implements PurchaseOrderLineRepository {
	
	@Inject
	private InitialData initialData;
	
	/*
	 * Add purchase order line*/
	public void persistPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
		initialData.addPurchaseOrderLine(purchaseOrderLine);
	}
	
	/*
	 * Find a purchase order line by Id*/
	@Override
	public PurchaseOrderLine findByPurchaseOrderLineIdSingle(long id){
		ArrayList<PurchaseOrderLine> purchaseOrderLineList = initialData.getPurchaseOrderLines();
		
		for (int i = 0; i < purchaseOrderLineList.size(); i++){
			if (purchaseOrderLineList.get(i).getPurchaseOrderlineId() == id){
				return purchaseOrderLineList.get(i);
			}
		}
		return null;
	}
	
	/*
	 * Get Purchase Order Lines */
	@Override
	public ArrayList<PurchaseOrderLine> getPurchaseOrderLines(long id){
		return initialData.getPurchaseOrderLines();
	}
	
	/*
	 * Update Purchase Order Line*/
	@Override
	public void updatePurchaseOrderLine(PurchaseOrderLine p){
		ArrayList<PurchaseOrderLine> purchaseOrderLineList = initialData.getPurchaseOrderLines();
		
		for (int i = 0; i < purchaseOrderLineList.size(); i++) {
			if (purchaseOrderLineList.get(i).getPurchaseOrderlineId() == p.getPurchaseOrderlineId()){
				purchaseOrderLineList.set(i, p);
				initialData.setPurchaseOrderLines(purchaseOrderLineList);
				break;
			}
		}
	}
	
	/*
	 * Remove Purchase Order Line*/
	@Override
	public void removePurchaseOrderLine(PurchaseOrderLine p){
		ArrayList<PurchaseOrderLine> purchaseOrderLineList = initialData.getPurchaseOrderLines();
		
		for (int i = 0; i < purchaseOrderLineList.size(); i++){
			if (purchaseOrderLineList.get(i).getPurchaseOrderlineId() == p.getPurchaseOrderlineId()){
				purchaseOrderLineList.remove(i);
			}
		}
	}
	
	/*
	 * Add Purchase Order Line*/
	@Override
	public void addPurchaseOrderLine(PurchaseOrderLine purchaseOrderLine){
		initialData.addPurchaseOrderLine(purchaseOrderLine);
	}
}

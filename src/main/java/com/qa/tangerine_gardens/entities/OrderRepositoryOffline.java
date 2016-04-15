package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class OrderRepositoryOffline 
implements OrderRepository {
	@Inject
	private OrderInitialData OrderInitialData;
	
	@Override
	public void persistOrder(Order o) {
	OrderInitialData.addOrder(o);	
	}

	@Override
	public Order findByOrderID(int id) {
		ArrayList<Order> os = (ArrayList<Order>) OrderInitialData.getOrders();
		for(int i=0;i<os.size(); i++){
			if(os.get(i).getOrder_id().equals(id)){
				System.out.println(os.toString());
			}
		}		
			return null;
	}

	@Override
	public void updateOrder(Order o) {
		ArrayList<Order> os = (ArrayList<Order>) OrderInitialData.getOrders();
		for(int i=0;i<os.size(); i++){
			if(os.get(i).equals(o)){
				os.set(i, o);
			}
		}
		OrderInitialData.setOrder(os);
		
	}
	@Override
	public void persistOrder(List<Order> o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Order> getOrders() {
		return (ArrayList<Order>) OrderInitialData.getEntityList();
	}
}
package com.qa.tangerine_gardens.entities;
import java.util.ArrayList;
import java.util.List;

	
	public interface OrderRepository {
		public void persistOrder (Order o);
		public void persistOrder (List<Order> o);
		
		public Order findByOrderID(int id);
		public ArrayList<Order> getOrders();
		
		public void updateOrder (Order a);
		
	}



package com.qa.tangerine_gardens.entities;
import java.util.ArrayList;
import java.util.List;
/**
 * Order repositorys  interface created for Order Entity by Christine Stokes
 * methods are defined in here and the actual methods are in OrderRepositoryOffline
 * @author Christine Stokes
 *
 */

	
	public interface OrderRepository {
		public void persistOrder (Order o);
		public void persistOrder (List<Order> o);
		
		public Order findByOrderID(int id);
		public ArrayList<Order> getOrders();
		
		public void updateOrder (Order o);
	}
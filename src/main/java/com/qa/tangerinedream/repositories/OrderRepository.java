package com.qa.tangerinedream.repositories;
import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.Order;

import repositorybackend.OrderStatus;
/**
 * Order repositorys  interface created for Order Entity by Christine Stokes
 * methods are defined in here and the actual methods are in OrderRepositoryOffline
 * @author Christine Stokes
 *
 */

	
	public interface OrderRepository {
		public void persistOrder (Order o);
		public void persistOrder (List<Order> o);
		
		public Order findByOrderID(long orderID);
		public ArrayList<Order> getOrders();
		
		
		public void updateOrder (Order o);
		public Order findUserAndStatus(long userId, OrderStatus orderStatus);
		public Order findUsersOrderHistory(long userID);
		public Order findUsersPendingOrder(long userId);
		Order findUserAndStatus1(long userId, OrderStatus orderStatus);
		public void delete(Order order);
	}
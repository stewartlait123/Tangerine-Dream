package com.qa.tangerinedream.repositories;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.Product;

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
		@Deprecated
		public Order findUsersPendingOrder(long userId);
		public void delete(Order order);
		public ArrayList<Order> orderHistory(long customerID);
	}
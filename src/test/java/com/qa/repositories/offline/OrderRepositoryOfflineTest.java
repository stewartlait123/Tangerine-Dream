package com.qa.repositories.offline;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.junit.Test;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.repositories.offline.OrderRepositoryOffline;

import repositorybackend.OrderStatus;

public class OrderRepositoryOfflineTest {
	
	Customer customer = new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 0, 0);
	Order order = new Order(customer, OrderStatus.PLACED);
	OrderRepositoryOffline orderRepo;
	
	@PostConstruct
	public void initialOrderRepo()
	{
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
	}
	
	@Test
	public void testFindUserAndStatus() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertNotNull(orderRepo.findUserAndStatus(1, OrderStatus.PLACED));
	}

	@Test
	public void testUpdateOrder() {
		
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		
		Order newOrder = order;
		newOrder.setStatus(OrderStatus.ACCEPTED);
		orderRepo.updateOrder(newOrder);
		
		assertEquals(OrderStatus.ACCEPTED, orderRepo.findUsersOrderHistory(1).getStatus());
	}

	@Test
	public void testGetOrders() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertNotNull(orderRepo.getOrders());
	}

	@Test
	public void testFindUsersOrderHistory() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertNotNull(orderRepo.findUsersOrderHistory(1));
	}

	@Test
	public void testFindUsersPendingOrder() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertNotNull(orderRepo.findUsersPendingOrder(1));
	}

	@Test
	public void testDelete() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		orderRepo.delete(order);
		assertNull(orderRepo.findByOrderID(order.getOrder_id()));
		orderRepo.persistOrder(order);
	}

	@Test
	public void testFindByOrderID() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertEquals(order, orderRepo.findByOrderID(1));
	}

	@Test
	public void testOrderHistory() {
		orderRepo = mock(OrderRepositoryOffline.class);
		orderRepo.persistOrder(order);
		assertNotNull(orderRepo.orderHistory(1));
	}

}

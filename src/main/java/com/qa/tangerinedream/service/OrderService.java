package com.qa.tangerinedream.service;

import static repositorybackend.OrderStatus.PENDING;
import static repositorybackend.OrderStatus.PLACED;

import java.util.Calendar;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qa.tangerinedream.controllers.PendingOrder;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.CustomerRepository;

import com.qa.tangerinedream.repositories.OrderRepository;
import com.qa.tangerinedream.repositories.ProductRepository;

import repositorybackend.OrderStatus;

@Stateless
public class OrderService {
	@Inject private OrderRepository orderRepository;
	@Inject private ProductRepository productRepository;
	@Inject private CustomerRepository customerRepository;
	@Inject private PendingOrder currentOrder;

	public Order getUsersPendingOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		return order;
	}

	public float calcOrderTotalPending(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getCost_price();
				totalPrice = totalPrice + price;
			}
			return totalPrice;
		} else
			return 0;
	}

	public float calcOrderTotalPlaced(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PLACED);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getCost_price();
				totalPrice = totalPrice + price;
			}
			return totalPrice;
		} else
			return 0;
	}

	public void addToBasket(long productId, int quantity, long userId) {
		System.out.println("quantity = " + quantity + "UserID = " + userId);
		Product product = productRepository.findByProductId(productId);
		Order order = orderRepository.findUserAndStatus(userId, PENDING);
		if (order != null) {
			boolean foundOrderLine = false;
			for (OrderLine ol : order.getOrderLines())
				if (ol.getproduct().getProduct_id() == productId) {
					ol.setquantity(quantity += ol.getquantity());
					foundOrderLine = true;
				}
			if (!foundOrderLine)
				order.addOrderLine(new OrderLine(product, quantity, product.getPrice()));
		} else
			order = new Order(orderRepository.getOrders().size(),PENDING, Calendar.getInstance().getTime(), customerRepository.findByID(userId),
					new OrderLine(product, quantity, product.getPrice()));
	}

	public void removeFromBasket(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		if (order != null) {
			for (OrderLine ol : order.getOrderLines())
				if (ol.getproduct().getProduct_id() == productId)
					order.removeOrderLine(ol);
		}

	}

	public void updateOrder(Order order, long userID) {
		if (order != null)
			orderRepository.updateOrder(order);

	}

	public void clearOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		orderRepository.delete(order);
	}

	public void placeOrder(long orderID, long userID) {
		Order order = orderRepository.findByOrderID(orderID);
		order.setStatus(PLACED);
		orderRepository.updateOrder(order);
	}

	public Order getUsersOrderHistory(long userID) {
		Order order = orderRepository.findUsersOrderHistory(userID);
		return order;
	}

	public Order getUsersPlacedOrders(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PLACED);
		return order;
	}

	public Order getUsersPaidOrders(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.PAID);
		return order;
	}

	public float calcOrderTotalPaid(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.PAID);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getCost_price();
				totalPrice = totalPrice + price;
			}
			return totalPrice;
		} else
			return 0;
	}

	public void placeOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		order.setStatus(PLACED);
		orderRepository.updateOrder(order);
	}

	public void updatequantity(long prod_ID, int quantity, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				if (ol.getproduct().getProduct_id() == prod_ID) {
					ol.setquantity(quantity);
				}
				orderRepository.updateOrder(order);
			}
		}
	}
}
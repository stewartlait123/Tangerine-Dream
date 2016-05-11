package com.qa.tangerinedream.service;

import static repositorybackend.OrderStatus.PENDING;
import static repositorybackend.OrderStatus.PLACED;

import java.util.Calendar;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.CustomerRepository;

import com.qa.tangerinedream.repositories.OrderRepository;
import com.qa.tangerinedream.repositories.ProductRepository;

import repositorybackend.OrderStatus;

@Stateless
public class OrderService {
	@Inject
	OrderRepository orderRepository;
	@Inject
	ProductRepository productRepository;
	@Inject
	CustomerRepository customerRepository;

	private Order order;
	public Order getUsersPendingOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);

//return new Order(PENDING, currentdate, new Customer(0, "bill", "bill", "bill", new Date(), 0, 0), new OrderLine(new Product("gnome", 1, 1, 1, 1, 1, 1, 1, "Gnome", " "), 1, 1));
		return order;

//		return new Order(PENDING, currentdate, new Customer(0, "bill", "bill", "bill", new Date(), 0, 0), new OrderLine(new Product(15,"gnome", 1, 1, 1, 1, 1, 1, 1, "Gnome", " "), 1, 1));

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

	Date currentdate = Calendar.getInstance().getTime();

	public void addToBasket(long productId, int quantity, long userId) {
		System.out.println("Reached here!!!");
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

			order = new Order(PENDING, currentdate, customerRepository.findByID(userId),
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
		Order order = orderRepository.findUserAndStatus(userID, PLACED);
		if (order != null) {
			for (OrderLine ol : order.getOrderLines())
				order.removeOrderLine(ol);
		}
	}

	public void placeOrder(Order order, long userID) {
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				long prodID = ol.getproduct().getProduct_id();
				Product product = productRepository.findByProductId(prodID);
				int stock_level = ol.getproduct().getStock();
				int quantity = ol.getquantity();
				if (quantity <= stock_level) {
					product.setStock(stock_level - quantity);
					order.setStatus(PLACED);
					orderRepository.updateOrder(order);
				}

			}
		}
	}

	public Order getUsersOrderHistory(long userID) {
		order = orderRepository.findUsersOrderHistory(userID);
		return order;
	}

	public Order getUsersPlacedOrders(long userID) {
		order = orderRepository.findUserAndStatus(userID, PENDING);	
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
}
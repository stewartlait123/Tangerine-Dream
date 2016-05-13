package com.qa.tangerinedream.service;

import static repositorybackend.OrderStatus.PENDING;
import static repositorybackend.OrderStatus.PLACED;
import java.util.Calendar;
import java.util.List;

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

	public String calcOrderTotalPending(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getPrice();
				totalPrice = totalPrice + price;
			}
			String totalPrice1 = String.format("%.2f", totalPrice); 
			return totalPrice1;
		} else
			return null;
	}

	public String calcOrderTotalPlaced(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PLACED);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getPrice();
				totalPrice = totalPrice + price;
			}
			String totalPrice1 = String.format("%.2f", totalPrice); 
			return totalPrice1;
		} else
			return null;
	}

	public void addToBasket(long productId, int quantity, long userId) {
		float price = 0;
		Product product = productRepository.findByProductId(productId);
		Order order = orderRepository.findUserAndStatus(userId, PENDING);
		if (order != null) {
			boolean foundOrderLine = false;
			for (OrderLine ol : order.getOrderLines())
				if (ol.getproduct().getProduct_id() == productId) {
					ol.setquantity(quantity += ol.getquantity());
					price = ol.getquantity()*product.getPrice();
					String price1 = String.format("%.2f", price);
					ol.setPrice(price1);
					foundOrderLine = true;
				}
			if (!foundOrderLine){
				price = quantity*product.getPrice();
				String price1 = String.format("%.2f", price);
				String.format("%.2f", price);
				order.addOrderLine(new OrderLine(product, quantity, price1));
			}
				
		} else {
			price = quantity*product.getPrice();
			String price1 = String.format("%.2f", price);
			order = (new Order(orderRepository.getOrders().size(),PENDING, Calendar.getInstance().getTime(), customerRepository.findByID(userId),
					new OrderLine(product, quantity, price1)));
			orderRepository.persistOrder(order);
		}
	}

	public void removeFromBasket(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		System.out.println("Reached here!!");
		if (order != null) {
			List<OrderLine> lines = order.getOrderLines();
			for (int i = 0; i < lines.size(); i++)
				if (lines.get(i).getproduct().getProduct_id() == productId)
					lines.remove(i);
			order.setOrderLines(lines);
		orderRepository.updateOrder(order);
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

	public String calcOrderTotalPaid(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.PAID);
		float totalPrice = 0;
		float price;
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				price = ol.getquantity() * ol.getproduct().getPrice();
				totalPrice = totalPrice + price;
			}
			String totalPrice1 = String.format("%.2f", totalPrice); 
			return totalPrice1;
		} else
			return null;
	}

	public void placeOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		order.setStatus(PLACED);
		orderRepository.updateOrder(order);
	}

	public void updatequantity(long prod_ID, int quantity, long userID) {
		Product product = productRepository.findByProductId(prod_ID);
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		if (order != null) {
			for (OrderLine ol : order.getOrderLines()) {
				if (ol.getproduct().getProduct_id() == prod_ID) {
					ol.setquantity(quantity);
					float price = ol.getquantity()*product.getPrice();
					String price1 = String.format("%.2f", price);
					ol.setPrice(price1);
					
				}
				orderRepository.updateOrder(order);
			}
		}
	}

	public void addToWishList(long productId, long userId) {
		Order order = orderRepository.findUserAndStatus(userId, PENDING);
		Order wishlist = orderRepository.findUserAndStatus(userId, OrderStatus.WISHLIST);
		boolean orderfound = false;
		if (wishlist != null){
			for (OrderLine ol : wishlist.getOrderLines()){
				if (ol.getproduct().getProduct_id()==productId)
					orderfound = true;
			}
		}
		List<OrderLine> lines = order.getOrderLines();
		for (int i = 0; i < lines.size(); i++){
			if (lines.get(i).getproduct().getProduct_id() == productId){
				if(orderfound==false){
					wishlist.addOrderLine(lines.get(i));
				}
				lines.remove(i);
				order.setOrderLines(lines);
			orderRepository.updateOrder(wishlist);	
			}
						
				}
			
		
	}
}
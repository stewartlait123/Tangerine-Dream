/**
 * @author Stewart Lait
 */

package com.qa.tangerinedream.service;

import java.util.Calendar;
import java.util.List;

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
public class WishlistService {
	@Inject private OrderRepository orderRepository;
	@Inject private CustomerRepository customerRepository;
	@Inject private ProductRepository productRepository;
	
	public void addToWishlist(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.WISHLIST);
		if(order==null){
			order=new Order(customerRepository.findByID(userID), OrderStatus.WISHLIST);
			orderRepository.persistOrder(order);
		}
		Product product = productRepository.findByProductId(productId);
		if(!order.getOrderLines().contains(product))
			order.addOrderLine(new OrderLine(product, 0, 0));
		orderRepository.updateOrder(order);
	}

	public void removeFromWishlist(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.WISHLIST);
		if(order!=null) {
			List<OrderLine> lines = order.getOrderLines();
			for (int i = 0; i < lines.size(); i++)
				if (lines.get(i).getproduct().getProduct_id() == productId)
					lines.remove(i);
			order.setOrderLines(lines);
		orderRepository.updateOrder(order);			
		}
	}
	
	public List<OrderLine> getWishlist(long userID) {

		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.WISHLIST);
		System.out.println(order.toString());	
		return order.getOrderLines(); 
	}

	public synchronized void addToBasket(long productId, long userID) {
		Order wishlist = orderRepository.findUserAndStatus(userID, OrderStatus.WISHLIST);
		Order order = orderRepository.findUserAndStatus(userID, OrderStatus.PENDING);
		if (order != null) {
			for (OrderLine ol: wishlist.getOrderLines())
				if (ol.getproduct().getProduct_id() == productId) {
					order.addOrderLine(ol);
					wishlist.removeOrderLine(ol);
					break;
				}
		} else {
			order = new Order(OrderStatus.PENDING, Calendar.getInstance().getTime(), customerRepository.findByID(userID), new OrderLine(productRepository.findByProductId(productId), 1, 0));
			for (OrderLine ol: wishlist.getOrderLines())
				if (ol.getproduct().getProduct_id() == productId){
					wishlist.removeOrderLine(ol);
					break; }	
		}
	}
}
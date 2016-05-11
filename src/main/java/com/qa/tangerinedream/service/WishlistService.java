/**
 * @author Stewart Lait
 */

package com.qa.tangerinedream.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
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
		Order order = orderRepository.findUserAndStatus1(userID, OrderStatus.WISHLIST);
		if(order==null){
			order=new Order(customerRepository.findByID(userID), OrderStatus.WISHLIST);
			orderRepository.persistOrder(order);
		}
		ArrayList<OrderLine> lines = (ArrayList<OrderLine>) order.getOrderLines();
		boolean alreadySaved = false;
		for(OrderLine line : lines)
			if (line.getproduct().getProduct_id() == productId)
				alreadySaved = true;
		if(!alreadySaved)
			order.addOrderLine(new OrderLine(productRepository.findByProductId(productId), 0, 0));
		orderRepository.updateOrder(order);
	}

	public void removeFromWishlist(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus1(userID, OrderStatus.WISHLIST);
		if(order!=null) {
			List<OrderLine> lines = order.getOrderLines();
			//for (int i = 0; i < lines.size(); i++)
				//if (lines.get(i).getproduct().getProduct_id() == productId)
					//lines.remove(i);
			order.setOrderLines(lines);
		orderRepository.updateOrder(order);			
		}
	}
	
	public List<OrderLine> getWishlist(long userID) {

		Order order = orderRepository.findUserAndStatus1(userID, OrderStatus.WISHLIST);
		System.out.println(order.toString());	
		return order.getOrderLines(); 
	}


}
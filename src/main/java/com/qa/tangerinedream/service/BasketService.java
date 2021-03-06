package com.qa.tangerinedream.service;

import static repositorybackend.OrderStatus.PENDING;



import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;



import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.repositories.OrderRepository;
import com.qa.tangerinedream.repositories.ProductRepository;

@Stateless
public class BasketService {
	@Inject OrderRepository orderRepository;
	@Inject ProductRepository productRepository;
	@Inject CustomerRepository customerRepository;

	
	public void addToBasket(long productId, int quantity, long userId) {
		Product product = productRepository.findByProductId(productId);
		Order order = orderRepository.findUsersPendingOrder(userId);
		if(order != null) {
			boolean foundOrderLine = false;
			for(OrderLine ol : order.getOrderLines())
				if(ol.getproduct().getProduct_id()==productId){
					ol.setquantity(quantity += ol.getquantity());
					foundOrderLine = true;
				}
			if(!foundOrderLine)
				order.addOrderLine(new OrderLine(product, quantity, product.getPrice()));
		} else 

			order = new Order(orderRepository.getOrders().size(),PENDING, new Date(), customerRepository.findByID(userId), new OrderLine(product, quantity, product.getPrice()));

	}




	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}




}
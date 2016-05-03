	package com.qa.tangerinedream.service;

	import static repositorybackend.OrderStatus.PENDING;

	import java.util.Calendar;

	import javax.inject.Inject;

	import com.qa.tangerinedream.entities.Customer;
	import com.qa.tangerinedream.entities.Order;
	import com.qa.tangerinedream.entities.OrderLine;
	import com.qa.tangerinedream.entities.Product;
	import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.repositories.OrderLineRepository;
import com.qa.tangerinedream.repositories.OrderRepository;
	import com.qa.tangerinedream.repositories.ProductRepository;
import com.qa.tangerinedream.repositories.offline.OrderLineRepositoryOffline;

	public class OrderService {
		@Inject OrderRepository orderRepository;
		@Inject ProductRepository productRepository;
		@Inject CustomerRepository customerRepository;
		@Inject OrderLineRepository orderlineRepository;



	public Order getUsersPendingOrder(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		return order;
	}

	public float calcOrderTotalPending(long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		float totalPrice = 0;
		float price;
		if (order != null){
			for (OrderLine ol : order.getOrderLines()){
				price = ol.getquantity() * ol.getproduct().getCost_price();
				totalPrice = totalPrice + price;
			}
			return totalPrice;
		}
		else 
			return 0;
	}
	
	

	public void addToBasket(long productId, int quantity, long userId) {
			Product product = productRepository.findByProductId(productId);
			Order order = orderRepository.findUserAndStatus(userId, PENDING);
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
				order = new Order(PENDING, Calendar.getInstance().getTimeInMillis(), customerRepository.findByID(userId), new OrderLine(product, quantity, product.getPrice()));
		}



	public void removeFromBasket(long productId, long userID) {
		Order order = orderRepository.findUserAndStatus(userID, PENDING);
		if (order != null) {
			for (OrderLine ol : order.getOrderLines())
				if (ol.getproduct().getProduct_id()==productId)
					order.removeOrderLine(ol);
			}
		
	}

	public void updateOrder(Order order, long userID) {
		if (order != null) {
			for (OrderLine ol : order.getOrderLines())
			orderlineRepository.updateOrderLine(ol);
	}
	}

	public void clearOrder(long userID) {
		// TODO Auto-generated method stub
	}

	public void placeOrder(Order order, long userID) {
		// TODO Auto-generated method stub	
	}
}
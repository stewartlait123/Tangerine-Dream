	package com.qa.tangerinedream.service;

	import static repositorybackend.OrderStatus.PENDING;

	import java.util.Calendar;

	import javax.inject.Inject;

	import com.qa.tangerinedream.entities.Customer;
	import com.qa.tangerinedream.entities.Order;
	import com.qa.tangerinedream.entities.OrderLine;
	import com.qa.tangerinedream.entities.Product;
	import com.qa.tangerinedream.repositories.CustomerRepository;
	import com.qa.tangerinedream.repositories.OrderRepository;
	import com.qa.tangerinedream.repositories.ProductRepository;

	public class OrderService {
		@Inject OrderRepository orderRepository;
		@Inject ProductRepository productRepository;
		@Inject CustomerRepository customerRepository;



	public Order getUsersPendingOrder(long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public float calcOrderTotalPending(long userID) {
		// TODO Auto-generated method stub
		return 0;
	}

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
				order = new Order(PENDING, Calendar.getInstance().getTimeInMillis(), customerRepository.findByID(userId), new OrderLine(product, quantity, product.getPrice()));
		}


	public void addToBasket(long productId, long userID) {
		// TODO Auto-generated method stub
	}

	public void removeFromBasket(long productId, long userID) {
		// TODO Auto-generated method stub
	}

	public void updateOrder(Order order, long userID) {
		// TODO Auto-generated method stub
	}

	public void clearOrder(long userID) {
		// TODO Auto-generated method stub
	}

	public void placeOrder(Order order, long userID) {
		// TODO Auto-generated method stub	
	}
}
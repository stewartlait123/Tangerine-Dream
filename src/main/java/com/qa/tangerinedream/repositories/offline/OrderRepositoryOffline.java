package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import repositorybackend.InitialData;
import repositorybackend.OrderStatus;

import static repositorybackend.OrderStatus.PENDING;
import static repositorybackend.OrderStatus.WISHLIST;

import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.entities.Product;
import com.qa.tangerinedream.repositories.OrderRepository;


/**
 * Program which allows the user to Create, read the dummy data, and Update the files.
 * All lists or just one row can be read and search can be done through ID number.
 * @author Christine Stokes
 *
 */
@Stateless
@Default
public class OrderRepositoryOffline 
implements OrderRepository {
	
	/**Changed injection from 'OrderInitialData' to 'InitialData' as all offline
	 * data is to be folded into this class. 
	*  Changed variable name 'OrderInitialData' to 'initialData' to reflect this.
	*  Jessica:changed to long rather than biginteger for order_id (james recommended)
	*/
	@Inject
	private InitialData initialData;

	@Override
	public void persistOrder(Order o) {
		initialData.addOrder(o);	
	}

	
	@Override
	public Order findUserAndStatus(long userId, OrderStatus orderStatus) {
		ArrayList<Order> orders = (ArrayList<Order>) initialData.getOrders();
		for (Order order : orders) {
			if(order.getCustomer().getCustomerId()==userId && order.getStatus().equals(orderStatus))	
				 return order;
		}
		return null;
	}
	


	@Override
	public void updateOrder(Order o) {
		ArrayList<Order> os = (ArrayList<Order>) initialData.getOrders();
		for(int i=0;i<os.size(); i++){
			if(os.get(i).equals(o)){
				os.set(i, o);
			}
		}
		initialData.setOrder(os);
		
	}
	@Override
	public void persistOrder(List<Order> o) {
		initialData.getOrders();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Order> getOrders() {
		return (ArrayList<Order>) initialData.getEntityList();
	}

	@Override
	public Order findUsersOrderHistory(long userID) {
		ArrayList<Order> os = (ArrayList<Order>) initialData.getOrders();
		for (Order order : os){
			if(order.getCustomer().getCustomerId()==userID && !order.getStatus().equals(PENDING) && !order.getStatus().equals(WISHLIST))
				return order;
			
		}return null;
	
	}

	@Override
	public Order findUsersPendingOrder(long userId) {

		ArrayList<Order> orders = (ArrayList<Order>) initialData.getOrders();
		for (Order order : orders){
			if(order.getCustomer().getCustomerId()==userId && order.getStatus().equals(PENDING)){
				System.out.println("Order Found");
			}
				return order;
		}
		System.out.println("Order not Found");
		return null;
	}

	@Override
	public void delete(Order order) {
		ArrayList<Order> orders = (ArrayList<Order>) initialData.getOrders();
		for (int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrder_id()==order.getOrder_id() && (order.getStatus().equals(WISHLIST) || order.getStatus().equals(PENDING))) {
				orders.remove(i);
			}
		}
	}

	@Override
	public Order findByOrderID(long orderID) {
		ArrayList<Order> os = (ArrayList<Order>) initialData.getOrders();
		for(Order order : os){
			if(order.getOrder_id() == orderID){
				return order;
			}
		}		
			
		return null;
	}
	
	public ArrayList<Order> orderHistory(long customerID){
		ArrayList<Order> orderList = initialData.getOrders();
		ArrayList<Order> orderHistory = new ArrayList<Order>();
		
		for(int i=0; i < orderList.size(); i++) {
			if (orderList.get(i).getCustomer().getCustomerId() == customerID){
				orderHistory.add(orderList.get(i));
			}
		}
		
		return orderHistory;
	}
}
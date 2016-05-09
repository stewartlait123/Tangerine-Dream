package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import repositorybackend.InitialData;
import repositorybackend.OrderStatus;

import static repositorybackend.OrderStatus.PENDING;
import static repositorybackend.OrderStatus.WISHLIST;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;

import com.qa.tangerinedream.repositories.OrderRepository;


/**
 * Program which allows the user to Create, read the dummy data, and Update the files.
 * All lists or just one row can be read and search can be done through ID number.
 * @author Christine Stokes
 *
 */
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
	public Order findByOrderID(int id) {
		ArrayList<Order> os = (ArrayList<Order>) initialData.getOrders();
		for(int i=0;i<os.size(); i++){
			if(os.get(i).getOrder_id() == id){
				System.out.println(os.toString());
			}
		}		
			return null;
	}
	
	@Override
	public Order findUserAndStatus(long userId, OrderStatus orderStatus) {
		ArrayList<Order> orders = (ArrayList<Order>) initialData.getOrders();
		for (Order order : orders)
			if(order.getCustomer().getCustomerId()==userId && order.getStatus().equals(orderStatus))
				return order;
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
		for (Order order : orders)
			if(order.getCustomer().getCustomerId()==userId && order.getStatus().equals(PENDING))
				return order;

		return null;
	}
}
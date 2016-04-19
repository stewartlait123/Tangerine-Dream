package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import repositorybackend.InitialData;

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
	@Inject
	
	/**Changed injection from 'OrderInitialData' to 'InitialData' as all offline
	 * data is to be folded into this class. 
	*  Changed variable name 'OrderInitialData' to 'initialData' to reflect this.
	*/
	
	private InitialData initialData;
	
	@Override
	public void persistOrder(Order o) {
		initialData.addOrder(o);	
	}

	@Override
	public Order findByOrderID(int id) {
		ArrayList<Order> os = (ArrayList<Order>) initialData.getOrders();
		for(int i=0;i<os.size(); i++){
			if(os.get(i).getOrder_id().equals(id)){
				System.out.println(os.toString());
			}
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Order> getOrders() {
		return (ArrayList<Order>) initialData.getEntityList();
	}
}
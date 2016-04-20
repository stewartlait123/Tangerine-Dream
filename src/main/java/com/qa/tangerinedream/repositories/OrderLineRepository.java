package com.qa.tangerinedream.repositories;

import java.util.ArrayList;
import java.util.List;

import com.qa.tangerinedream.entities.OrderLine;


/**
 * 
 * @author Jessica Maddocks
 * The Order Line Repository Interface
 *
 */


public interface OrderLineRepository {
	public void persistOrderLine (OrderLine o);
	public void persistOrderLines (List<OrderLine> o);
	
	public OrderLine findByName(String name);
	public ArrayList<OrderLine> getOrderLines();
	
	public void updateOrderLine (OrderLine o);
	
	public void removeOrderLine (OrderLine o);
	
}

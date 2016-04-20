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
	
	public ArrayList<OrderLine> getOrderLines();
	public ArrayList<OrderLine> findByOrderId(long order_id);
	
	public ArrayList<OrderLine> findByProductId(long product_id);
		
	public void updateOrderLine (OrderLine o);

}
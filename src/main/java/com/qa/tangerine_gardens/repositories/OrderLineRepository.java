package com.qa.tangerine_gardens.repositories;
import java.util.ArrayList;
import java.util.List;

import com.qa.tangerine_gardens.entities.OrderLine;

public interface OrderLineRepository {

	public void persistOrderLine (OrderLine ol);
	public void persistOrderLine (List<OrderLine> ol);
	
	public OrderLine findByOrderID(int id);
	public ArrayList<OrderLine> getOrderLine();
	
	public void updateOrderLine (OrderLine ol);
}

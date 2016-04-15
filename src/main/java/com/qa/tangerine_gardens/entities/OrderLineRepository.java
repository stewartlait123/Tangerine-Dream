package com.qa.tangerine_gardens.entities;
import java.util.ArrayList;
import java.util.List;

public interface OrderLineRepository {

	public void persistOrderLine (OrderLine ol);
	public void persistOrderLine (List<OrderLine> ol);
	
	public OrderLine findByOrderID(int id);
	public ArrayList<OrderLine> getOrderLine();
	
	public void updateOrderLine (OrderLine ol);
}

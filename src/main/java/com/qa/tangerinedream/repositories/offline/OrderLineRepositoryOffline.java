package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import javax.inject.Inject;
import repositorybackend.InitialData;
import com.qa.tangerinedream.entities.OrderLine;
import com.qa.tangerinedream.repositories.OrderLineRepository;

public class OrderLineRepositoryOffline 
implements OrderLineRepository {

	@Inject
	private InitialData initialData;
	
	@Override
	public void persistOrderLine(OrderLine o) {
		
		initialData.addOrderLine(o);
		
	}

	@Override
	public void persistOrderLines(ArrayList<OrderLine> o) {
		
		initialData.getOrderLines();
				
	}

	@Override
	public ArrayList<OrderLine> getOrderLines() {
		 
		return (ArrayList<OrderLine>) initialData.getOrderLines();
	}

	@Override
	public ArrayList<OrderLine> findByOrderId(long order_id) {
	
		ArrayList<OrderLine> orderLineList = initialData.getOrderLines();
		
		for (int i = 0; i < orderLineList.size(); i++){
			if (orderLineList.get(i).getOrder().getOrder_id() != order_id){
				orderLineList.remove(i);
			}
		}
		return orderLineList;
	}

	@Override
	@Deprecated
	public ArrayList<OrderLine> findByProductId(long product_id) {
		
		ArrayList<OrderLine> productLineList = initialData.getOrderLines();
		
		for (int i = 0; i < productLineList.size(); i++){
			if (productLineList.get(i).getproduct().getProduct_id() != product_id){
				productLineList.remove(i);
			}
		}
		
		return productLineList;
	}

	@Override
	public void updateOrderLine(OrderLine o) {
		
		ArrayList<OrderLine> orderLines = initialData.getOrderLines();
		
		for (int i = 0; i <orderLines.size(); i++) {
			if(orderLines.get(i) == o) {
				orderLines.set(i,o);
			break;
			}
		} 
	}
	
	@Override
	public void removeOrderLine(OrderLine o) {
		ArrayList<OrderLine> orderline = initialData.getOrderLines();
		
		for (int i=0; i < orderline.size(); i++){
			if(orderline.get(i) == o) {
				orderline.remove(i);
			}
		}
		initialData.setOrderLine(orderline);
	}
}

package dummy_data;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import entities.Order;
import entities.OrderLine;
import entities.Product;

@Singleton
public class Order_Line_InitialData {
	/** 
	 *  
	 *  @author Christine Stokes
	 */
	private ArrayList<OrderLine> OrderLine= new ArrayList<OrderLine>();
	
	public Order_Line_InitialData() {
		Order orderID = new Order();
		Product productID = new Product(0, null, 0, 0, 0, 0, 0, 0, 0, null);
		
		OrderLine.add(new OrderLine(orderID, productID, 2));
		OrderLine.add(new OrderLine(orderID, productID, 1));
		
	}

	public List<OrderLine>getOrderLine(){
		return OrderLine;
	}
		
		public void addOrderLine(OrderLine orderline){
			OrderLine.add(orderline);
		}
		public void setOrderLine(List<OrderLine> orderline) {
			OrderLine = (ArrayList<OrderLine>) orderline;
		}

		public List<OrderLine> getEntityList() {
			return OrderLine;
		}
	}
	
}

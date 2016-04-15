package com.qa.tangerine_gardens.entities;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

@Singleton
public class OrderInitialData {
private ArrayList<Order> Orders = new ArrayList<Order>();

public OrderInitialData() {
	Customer customerID = new Customer();
	
	Orders.add(new Order("1", "15/04/2016", customerID));
	
	Orders.add(new Order("2", "14/04/2016", customerID));
	
	
}
public List<Order> getOrders(){
	return Orders;

}
public void addOrder(Order order){
	Orders.add(order);
}
public void setOrder(List<Order> order) {
	Orders = order;
}

}

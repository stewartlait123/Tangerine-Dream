package com.qa.tangerine_gardens.entities;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

@Singleton
public class OrderInitialData {
private ArrayList<Order> Orders = new ArrayList<Order>();

public OrderInitialData() {
	Customer customerID = new Customer();
	Date currentDate = null;
	DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
	try {
		currentDate = (Date) df.parse("15/04/2016");
	} catch (ParseException e) {
		System.out.println("Error in creating date!");
		e.printStackTrace();
	}
	Orders.add(new Order(1, currentDate, customerID));
	
	
	Orders.add(new Order(2, currentDate, customerID));
	
	
}
public List<Order>getOrders(){
	return Orders;

}
public void addOrder(Order order){
	Orders.add(order);
}
public void setOrder(List<Order> order) {
	Orders = (ArrayList<Order>) order;
}



}

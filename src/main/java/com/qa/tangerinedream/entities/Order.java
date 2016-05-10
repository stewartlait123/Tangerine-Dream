/* 
 * 
 */

package com.qa.tangerinedream.entities;

/**
 * Order Entity table created by Christine Stokes Team Tangerine the columns in the
 * table are defined and reference to Customer class included
 * @author Christine Stokes
 */
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import repositorybackend.OrderStatus;
@Entity
@Table (name="order")

public class Order {

	@Id
	@Column (name = "order_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long order_id;  // order id an autogenerated number
	
	@Column(name = "status", nullable = false, length = 10)
	@NotNull
	@Size (min = 1, max = 10)
	private OrderStatus status; // Status which needs to be converted to an enum at time
	
	@Column(name = "order_date", length = 50)
	@NotNull
	@Size (min = 6, max = 50)
	private Date order_date; // the column for date order placed
	
	@ManyToOne
	@JoinColumn (name = "order_customer_id_fk", nullable = false)
	@NotNull
	private Customer customer; // Customer ID taken from customer table

	@OneToMany(mappedBy="OrderLine")
	private List<OrderLine> orderLines = new ArrayList<OrderLine>();
	

	public Order(){
		orderLines = new ArrayList<>();
	}
	
	public Order(Customer customer, OrderStatus status){
		orderLines = new ArrayList<>();
		this.customer = customer;
		this.status = status;
	}

	/**
	 *   method to allow dummy data to be generated 
	 * @param status
	 * @param date
	 * @param customerID
	 
	public Order(OrderStatus status, Date currentDate, Customer customer, OrderLine orderLine) {
		this.status = status;
		this.order_date.setTime(currentDate);
		this.customer = customer;
		this.orderLines = new ArrayList<>();
		this.orderLines.add(orderLine);
	}
	*/


	public Order(OrderStatus status, Date date, Customer customer, OrderLine orderLine){

		this.status = status;
		this.order_date = date;
		this.customer = customer;
		this.orderLines.add(orderLine);
	}

	// methods which will be defined in OrderRepositoryOffline and OrderLineRepository
	public long getOrder_id() {
		return order_id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}	
	
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	public void addOrderLine(OrderLine orderLine){
		this.orderLines.add(orderLine);
		if(orderLine.getOrder() != this)
			orderLine.setOrder(this);
	}
	public void removeOrderLine(OrderLine orderline){
		this.orderLines.remove(orderline);
	}
	public void updateOrderLine(OrderLine orderline){
		for (int i=0; i < orderLines.size(); i++){
			if(orderLines.get(i) == orderline) {
				orderLines.set(i, orderline);
			}
		}
	}


	
	
}
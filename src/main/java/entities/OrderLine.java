package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Jessica Maddocks 
 * @version 2.1
 * The Entity for the Orderline class.
 * Christine Stokes created version 1.0.
 */

@Entity
@Table (name = "OrderLines")
public class OrderLine {
	@Id 
	@Column (name = "order")
	@GeneratedValue	(strategy = GenerationType.IDENTITY)//*****************continue from here
	private Order order;
	private Product product;  
	private int quantity;
	private int purchasePrice;
	
	//constructors for attributes
	public OrderLine (Order order, Product product, int quantity, int purchasePrice) {
	
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		
	}
	
	//attributes getters
	public Order getorder(){
		
		return order;  
	}
	
	public Product getproduct(){
		
		return product;	
	}

	public int getquantity(){
		
		return quantity; 		
	}
	
	public int getpurchasePrice(){
		
		return purchasePrice;		
	}
	
	//attributes setters
	public void setorder(Order order){
		
		this.order = order;  		
	}
	
	public void setproduct(Product product){
		
		this.product = product;	
	}

	public void setquantity(int quantity){
		
		this.quantity = quantity; 		
	}
	
	public void setpurchasePrice(int purchasePrice){
		
		this.purchasePrice = purchasePrice;		
	}
	
}
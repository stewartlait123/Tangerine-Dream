package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This is the orderLine entity
 * 
 * @author Jess
 *
 */
@Entity
@Table (name="orderline")
public class OrderLine {
	@Id
	@OneToMany 
	@JoinColumn(name = "order_id_fk", nullable = true)
	private Order order;
	
	@Id
	@OneToMany 
	@JoinColumn(name = "product_id_fk", nullable = true)
	private Product product;
	
	
	@Column (name = "quantity")
	private int quantity;
	
	public OrderLine(){}
	
	public OrderLine(Order order, Product product, int quantity){
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}
	
	public Order getOrder()
	{
		return order;
	}
	
	public Product getProduct()
	{
		return product;
	}
	
	/**
	 * gets the quantity
	 * 
	 * @return int - quantity
	 */
	public int getQuantity()
	{ return quantity; }

	public void setQuantity(int quantity)
	{ this.quantity = quantity; }
}
/*
 * Created by Umar */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "purchase_order_line")
public class PurchaseOrderLine {
	
	@Id
	@Column(name = "purchase_orderline_id")
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	public long purchase_orderline_id;
	
	@Column ( name = "qty")
	public int quantity;
	
	@ManyToOne
	@JoinColumn( name = "purchase_order_id_fk", nullable = false)
	public int purchase_order_id_fk;

	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int value){
		this.quantity = value;
	}
	
	public long getPurchaseOrderlineId(){
		return purchase_orderline_id;
	}
	
	public int getPurchaseOrderId()
	{
		return purchase_order_id_fk;
	}
}

/*
 * Created by Umar */
package entities;
/**
 * This is the PurchaseOrderLine entity
 * 
 * @author Iain Q
 *
 */
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
	private PurchaseOrder purchase_order_id;

	public PurchaseOrderLine(int i, PurchaseOrder purchaseOrder) {
		// TODO Auto-generated constructor stub
	}

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

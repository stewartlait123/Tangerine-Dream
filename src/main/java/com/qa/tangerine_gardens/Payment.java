package com.qa.tangerine_gardens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "payment")

public class Payment {
	
	@Id
	@Column (name = "payment_id")
	@GeneratedValue ( strategy  =GenerationType.IDENTITY)
	private int payment_id;
	
	@Column (name = "paymentType", nullable = false, length = 19)
	@NotNull
	private int payment_type;
	
	@OneToOne
	@Column (name = "order_id")	
	@JoinColumn(name = "order_id_fk", nullable = true)
	private int order_id_fk;
	
	@OneToMany 
	@JoinColumn(name = "address_id_fk", nullable = true)
	private int address_id_fk;
	
	
	public int getPaymentId()
	{
		return payment_id;
	}
	
	
	public int getPaymentType()
	{
		return payment_type;
	}
	
	//1 - 1
	public int getOrderId()
	{
		return order_id_fk;
	}
	
	public int getAddressId()
	{
		return address_id_fk;
	}

}

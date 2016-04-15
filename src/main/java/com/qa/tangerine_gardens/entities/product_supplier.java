package com.qa.tangerine_gardens.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "product_supplier")
public class product_supplier {
	
	@Id
	@Column (name = "psupplier_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int psupplier_id;
	
	
	@Column (name = "cost")
	private int cost;
	
	@OneToMany
	@JoinColumn(name = "supplier_fk", nullable = false)
	@NotNull
	private int supplier_id;
	
	@OneToMany
	@JoinColumn(name = "product_fk", nullable = false)
	@NotNull
	private int product_id;
	
	
	public int getPsupplier_id()
	{
		return psupplier_id;
	}
	
	public void setCost(int c)
	{
		cost = c;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	
	public int getSupplier()
	{
		return supplier_id;
	}
	
	public int getProduct_id()
	{
		return product_id;
	}

}

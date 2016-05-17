package com.qa.tangerinedream.entities;

/**
 * This is the ProductSupplier entity
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "product_supplier")
public class ProductSupplier {
	
	@Id
	@Column (name = "psupplier_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int psupplier_id;

	@Column (name = "cost")
	private int cost;
	
	@OneToMany
	@JoinColumn(name = "supplier_fk", nullable = false)
	@NotNull
	private Supplier supplier;
	
	@OneToMany
	@JoinColumn(name = "product_fk", nullable = false)
	@NotNull
	private Product product;
	
	public ProductSupplier(Supplier supplier, Product product, int cost) {
		this.product = product;
		this.supplier = supplier;
		this.cost = cost;
				
	}

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
	
	public Supplier getSupplier()
	{
		return supplier;
	}
	
	public Product getProduct()
	{
		return product;
	}
	
	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}

}

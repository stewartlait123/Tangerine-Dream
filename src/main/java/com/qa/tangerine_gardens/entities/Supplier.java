package com.qa.tangerine_gardens.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="supplier")

public class Supplier {

	@Id
	@Column (name = "supplier_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private BigInteger supplier_id;
	
	
	public Supplier(){}

	public BigInteger getSupplier_id() {
		return supplier_id;
	}

	
}

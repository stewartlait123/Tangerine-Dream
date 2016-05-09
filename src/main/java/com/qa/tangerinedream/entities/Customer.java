// Author @ Finley Peters - Team Tang 2016
// Base customer class containing database tags.


package com.qa.tangerinedream.entities;

/**
 * This is the Customer entity
 * 
 * @author Iain Q
 *
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "customer")
public class Customer {
	@Id
	@Column (name = "customer_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long customer_id;

	@Column (name = "name", nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)

	private String name;

	@Column (name = "username",	nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)
	private String username;

	@Column (name = "password", nullable = false, length = 225)
	@NotNull
	@Size (min = 5, max = 225)
	private String password;


	@Column (name = "dob", nullable = false)
	@NotNull
	private Date dob;

	//Currency types changed to ints
	@Column (name = "credit", nullable = true)
	private float credit;


	@Column (name = "credit", nullable = true)
	private long credit_limit;

	@Column (name = "creditLimit", nullable = true)
	private long credit_limit1;

	
	//Constructor added for creation in InitialData class
	public Customer(String name_, String username_, String password_, Date date, int credit_, int creditLimit_ )
	{
		name = name_;
		username = username_;
		password = password_;
		dob = date;
		credit = credit_;
		credit_limit = creditLimit_;
	}

	public Customer(){}
	
	public Customer(long customer_id, String name, String username, String password, Date dob, int credit,
			int credit_limit) {
		this.customer_id = customer_id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.credit = credit;
		this.credit_limit = credit_limit;
	}
	
	public Long getCustomerId()
		{ return customer_id; }
	public String getName()
		{ return name; }

	public void setName(String name)
		{ this.name = name; }

	public String getUsername()
		{ return username; }

	public void setUsername(String username)
		{ this.username = username; }

	public String getPassword()
		{ return password; }

	public void setPassword(String password)
		{ this.password = password; }

	public Date getDob()
		{ return dob; }

	public void setCredit(float credit_)
		{ this.credit = credit_; }

	public float getCredit()
		{ return credit; }

	public void setCreditLimit(long creditLimit_)
		{ this.credit_limit = creditLimit_; }
	
	public void setDOB(Date dob)
	{ this.dob = dob; }

	public long getCreditLimit()
		{ return credit_limit; }

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", username=" + username + ", password="
				+ password + ", dob=" + dob + ", credit=" + credit + ", credit_limit=" + credit_limit + "]";
	}

}

	
	
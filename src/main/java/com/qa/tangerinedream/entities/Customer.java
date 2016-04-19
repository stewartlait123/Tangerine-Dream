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
	private Long customer_id;

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
	private int credit;

	@Column (name = "credit", nullable = true)
	private int credit_limit;
	
	//Constructor added for creation in InitialData class
	public Customer(Long Id_, String name_, String username_, String password_, Date date, int credit_, int creditLimit_ )
	{
		customer_id = Id_;
		name = name_;
		username = username_;
		password = password_;
		dob = date;
		credit = credit_;
		credit_limit = creditLimit_;
	}

	public Customer(){
		
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

	public void setCredit(int credit)
		{ this.credit = credit; }

	public int getCredit()
		{ return credit; }

	public void setCreditLimit(int credit_limit)
		{ this.credit_limit = credit_limit; }

	public int getCreditLimit()
		{ return credit_limit; }

}

	
	
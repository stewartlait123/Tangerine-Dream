package com.qa.tangerine_gardens;

import java.sql.Date;
import java.util.Currency;

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
	@GeneratedValue (
		strategy = GenerationType.IDENTITY)
	private Long customer_id;

	@Column (name = "name",
		nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)

	private String name;

	@Column (name = "username",
		nullable = false, length = 225)
	@NotNull
	@Size (min = 2, max = 225)
	private String username;

	@Column (name = "password",
		nullable = false, length = 225)
	@NotNull
	@Size (min = 5, max = 225)
	private String password;


	@Column (name = "dob",
		nullable = false)
	@NotNull
	private Date dob;

	@Column (name = "credit",
		nullable = true)
	private Currency credit;

	@Column (name = "credit",
		nullable = true)
	private Currency credit_limit;

	public Long getCustomer_id()
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

	public void setCredit(Currency credit)
		{ this.credit = credit; }

	public Currency getCredit()
		{ return credit; }

	public void setCreditLimit(Currency credit_limit)
		{ this.credit_limit = credit_limit; }

	public Currency getCreditLimit()
		{ return credit_limit; }

}

	
	
package com.qa.tangerinedream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "card")
public class Card {
	@Id
	@Column (name = "card_id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "type", nullable = false)
	@NotNull
	private String type;
	
	@Column (name = "nameOnCard", nullable = false)
	@NotNull	
	private String nameOnCard;
	
	@Column (name = "cardNumber", nullable = false, length = 16)
	@NotNull
	@Size (min = 16, max = 16)
	private String cardNumber;
	
	@Column (name = "expiryDate", nullable = false, length = 5)
	@NotNull
	@Size (min = 5, max = 5)
	private String expiryDate;
	
	@Column (name = "cSV", nullable = false, length = 3)
	@NotNull
	@Size (min = 3, max = 3)
	private String cSV;
	
	@ManyToOne
	@JoinColumn (name = "customer_id_fk")
	private Customer customer;

	public Card() { }
	
	public Card(String type, String nameOnCard, String cardNumber, String expiryDate, String cSV,
			Customer customer) {
		this.type = type;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cSV = cSV;
		this.customer = customer;
	}
	
	public Card(Long id, String type, String nameOnCard, String cardNumber, String expiryDate, String cSV,
			Customer customer) {
		this.id = id;
		this.type = type;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cSV = cSV;
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getcSV() {
		return cSV;
	}

	public void setcSV(String cSV) {
		this.cSV = cSV;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}
}
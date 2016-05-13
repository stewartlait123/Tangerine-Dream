package com.qa.tangerinedream.controllers;
//Author Jessica Maddocks Go Team Tang!

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.service.AddCardService;


@Named (value = "Addcard")
@RequestScoped
public class AddCardController {
	@Inject
	private AddCardService addCardService;
	private String error = "";
	private String type = "";
	private String nameOnCard = "";
	private String cardNumber = "";
	private String expiryDate = "";
	private String cSV = "";

	public String add(){
		System.out.println(nameOnCard + " " + cardNumber + " " + type + " " + expiryDate + " " + cSV);
		if (type.isEmpty() || nameOnCard.isEmpty() || cardNumber.isEmpty() || expiryDate.isEmpty() || cSV.isEmpty()) {
			error="empty fields";
			return "addcard";
		}
		addCardService.addCard(nameOnCard, cardNumber, type, expiryDate, cSV);
		return "cardadded";
		
	}
	
	public String cancel() {
		return "user_account_details";
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

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
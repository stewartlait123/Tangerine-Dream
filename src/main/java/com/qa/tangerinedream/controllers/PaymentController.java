package com.qa.tangerinedream.controllers;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/*
 * 
 *  @author Christine Stokes, TeamTang 2016
 * 
 */


import com.qa.tangerinedream.service.OrderService;
import com.qa.tangerinedream.service.PaymentService;


@RequestScoped
@Named(value= "Payment")

public class PaymentController {

	@Inject PaymentService paymentService;
	@Inject CurrentUser currentUser;
	@Inject OrderService orderservice;
	
	private String nameOnCard;
	private String cardNumber;
	private String expiryDate;
	private String cSV;
	
	private String method;
	
	/* Setter for Paying by Card */

	public String Submit(){
		if (method.equalsIgnoreCase("2")){
			if (nameOnCard.isEmpty() || cardNumber.isEmpty() || expiryDate.isEmpty() || cSV.isEmpty())
				return "payment";
			else {
				paymentService.paybycard(nameOnCard, cardNumber, expiryDate, cSV);
			return "orderconfirmed";
		}
		}
		else if (method.equalsIgnoreCase("3")){
			boolean accepted = false;
			paymentService.creditpayment(currentUser.getUserID(), accepted);
			
		return "orderconfirmed";
		}
		else
			return "payment";
	}
	

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void setcSV(String cSV) {
		this.cSV = cSV;
	}
	public PaymentService getPaymentService() {
		return paymentService;
	}
	public CurrentUser getCurrentUser() {
		return currentUser;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String getcSV() {
		return cSV;
	}
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	


}

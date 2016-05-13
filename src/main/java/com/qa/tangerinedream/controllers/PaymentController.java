package com.qa.tangerinedream.controllers;

import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/*
 * 
 *  @author Christine Stokes, TeamTang 2016
 * 
 */

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.service.AddCardService;
import com.qa.tangerinedream.service.OrderService;
import com.qa.tangerinedream.service.PaymentService;


@RequestScoped
@Named(value= "Payment")

public class PaymentController {

	@Inject PaymentService paymentService;
	@Inject CurrentUser currentUser;
	@Inject OrderService orderservice;
	@Inject AddCardService addCardService;
	
	private String nameOnCard;
	private String cardNumber;
	private String expiryDate;
	private String cSV;
	private String error = "";
	

	
	/* Setter for Paying by Card */

	public String Submit(){
			if(paymentService.creditpayment(currentUser.getUserID()))
				return "orderconfirmed.xhtml";
			setError("Insufficient Credit Please use another payment option");
		return "payment.xhtml";
	}
	
	public List<Card> getCards() {
		return addCardService.list(currentUser.getUserID());
	}
	
	public String CurrentCardPayment(String csv, String expiry){
		return "orderconfirmed.xhtml";
	}

	public String PayNow(String name, String cardNum, String expiry, String csv){
		return "orderconfirmed.xhtml";
	}
	
	public String AddNow(String name, String cardNum, String expiry, String csv){
		return "orderconfirmed.xhtml";
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

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	


}

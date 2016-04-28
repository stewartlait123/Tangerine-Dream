package com.qa.tangerinedream.controllers;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/*
 * 
 *  @author Finley Peters, TeamTang 2016
 * 
 */


@RequestScoped
@Named(value= "")
@PageScoped
public class PaymentController {

	@Inject PaymentService paymentService;
	@Inject LoggedInUser loggedInUser;
	
	
	public Boolean payByCard()
	{
		return false; //Returns a boolean for if the transaction succeeds or not
	}
	
	public Boolean payByCredit(loggedInUser.getID)
	{
		return false; //Returns a boolean for if the transaction succeeds or not
	}	
}

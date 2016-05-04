/*
 *  @Author Finley Peters Team Tang 2016
 */

package com.qa.tangerinedream.service;


import javax.inject.Inject;

import com.qa.tangerinedream.controllers.BasketController;
import com.qa.tangerinedream.controllers.CurrentUser;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.repositories.OrderRepository;

public class PaymentService {
	@Inject OrderRepository orderRepository;
	@Inject CustomerRepository customerRepository;
	@Inject BasketController basketController;
	@Inject CurrentUser currentUser;
	
	
	
	public void makeCardPayment()
	{
		//TODO add card payment logic.
		/**
		 * if(cardPaymentLogic/Method)
		 * {
		 * basketController.placeOrder();
		 *  }else
		 *  {
		 *  	inform user payment failed/send user to payment failed page
		 *  }
		 * 
		 * On a true return from the card payment process, placeOrder
		 * Until the functionality to charge a card is in place, assume
		 * the payment has been successful and just place the order, as below. 
		 */
		
		basketController.placeOrder();
	}
	
	public void makeCreditPayment()
	{
		//currentUser.getUserID()
		customerRepository.updateCredit( currentUser.getUserID(), (int) basketController.getTotalPrice());
		//TODO continue from here
	}
}

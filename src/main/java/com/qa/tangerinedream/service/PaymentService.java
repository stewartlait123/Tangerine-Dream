/*
 *  @Author Finley Peters Team Tang 2016
 */

package com.qa.tangerinedream.service;

import javax.inject.Inject;

import com.qa.tangerinedream.controllers.CurrentUser;
import com.qa.tangerinedream.repositories.CardRepository;
import com.qa.tangerinedream.repositories.CustomerRepository;
import com.qa.tangerinedream.repositories.OrderRepository;

public class PaymentService {
	@Inject OrderRepository orderRepository;
	@Inject CustomerRepository customerRepository;
	@Inject BasketService basketService;
	@Inject CurrentUser currentUser;
	@Inject OrderService orderservice;
	@Inject	private DateValidator dateValidator;
	@Inject	private CardRepository cardRepository;
	
	@Deprecated
	public void makeCardPayment()
	{
		//TODO add card payment logic.
		/*
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
		
		basketService.placeOrder();
	}

	public boolean paybycard(String nameOnCard, String cardNumber, String expiryDate, String cSV) {
		if(dateValidator.validateDate(expiryDate))
			return true;
		return false;
		
	}

	public boolean creditpayment(long userID) {
		float totalPlaced = Float.parseFloat(orderservice.calcOrderTotalPlaced(userID));
		if(customerRepository.findByID(userID).getCredit() >= totalPlaced) {
			System.out.println("Got to here!!!");
			customerRepository.updateCreditLimit(userID, customerRepository.findByID(userID).getCredit() - totalPlaced);
			return true;
		}
		return false;
	}



	public boolean currentCardService(String csv, String expiry, long getuserId, String cardNum) {
		if (dateValidator.validateDate(expiry) && (cardRepository.checkCustomerCardCSV(getuserId, cardNum, csv)))
		return true;
	return false;
	}
	
	
}

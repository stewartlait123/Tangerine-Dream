package com.qa.tangerinedream.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.repositories.CardRepository;
import com.qa.tangerinedream.repositories.CustomerRepository;

@Stateless
public class AddCardService {
	@Inject
	private DateValidator dateValidator;
	@Inject
	private CardRepository cardRepository;
	@Inject
	private CustomerRepository customerRepository;

	public void addCard(String nameOnCard, String cardNumber, String type, String expiryDate, String cSV, long custId) {
		if (dateValidator.validateDate(expiryDate)) {
			for (Card c : cardRepository.findForCustomer(customerRepository.findByID(custId)))
				if (c.getCardNumber().equals(cardNumber))
					return;
			cardRepository.persistCard(
					new Card(type, nameOnCard, cardNumber, expiryDate, cSV, customerRepository.findByID(custId)));
			System.out.println("--Gnome Life Bitcheaz!--");
		}
	}

	public List<Card> list(long userID) {
		System.out.println("--user ID:" + userID);
		System.out.println("--Customer:" + customerRepository.findByID(userID).getName());
		List<Card> cards = cardRepository.findForCustomer(customerRepository.findByID(userID));
		for(Card c : cards)
			System.out.println("--name on card: " + c.getNameOnCard());
		return cards;
	}
}
package com.qa.tangerinedream.repositories;

import java.util.List;

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.entities.Customer;

public interface CardRepository {
	public void persistCard(Card card);
	public Card findById(long id);
	public List<Card> findForCustomer(Customer customer);
	boolean checkCustomerCardCSV(long customerID, String cardNum, String csv); 
}
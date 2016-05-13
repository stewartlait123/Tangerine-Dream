package com.qa.tangerinedream.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CardRepository;

import repositorybackend.InitialData;

@Default
@Stateless
public class CardRepositoryOffline implements CardRepository {

	@Inject
	private InitialData initialData;
	
	@Override
	public void persistCard(Card card) {
		List<Card> cards = initialData.getCards(); //lists cards from initial data
		cards.add(card); //add new card
		System.out.println("--Added " + card.getCardNumber());
		initialData.setCards(cards); //update card into initial data
	}

	
	@Override
	public Card findById(long id) {
		List<Card> cards = initialData.getCards(); //lists cards from initial data
		for (Card card: cards)
			if (card.getId() == id)
				return card; //find card and returning if correct
		return null;
	}

	@Override
	public List<Card> findForCustomer(Customer customer) {
		List<Card> cards = initialData.getCards(); //lists cards from initial data
		List<Card> results = new ArrayList<>();
		for (Card card: cards) {
			System.out.println("--Customer is: " + card.getCustomer().getName());
			if (card.getCustomer().equals(customer))
				results.add(card);
		}
		return results;
	}

}

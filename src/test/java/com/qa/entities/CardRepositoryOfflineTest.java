package com.qa.entities;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.junit.Test;

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.offline.CardRepositoryOffline;

public class CardRepositoryOfflineTest {

	//Card(Long id, String type, String nameOnCard, String cardNumber, String expiryDate, String cSV,
	//Customer customer) 
	
	Customer customer = new Customer(1, "name", "user", "password", Calendar.getInstance().getTime(), 0, 0);
	Card card = new Card((long) 1, "type", "Test Name On Card", "1234123412341234", "06/2018", "666", customer);
	CardRepositoryOffline cardRepo;
	
	@PostConstruct
	public void initCardRepo()
	{
		cardRepo = mock(CardRepositoryOffline.class);
	}
	
	@Test
	public void testPersistCard() {
		cardRepo = mock(CardRepositoryOffline.class);
		cardRepo.persistCard(card);
		assertNotNull(cardRepo.findById(1));
	}

	@Test
	public void testFindById() {
		cardRepo = mock(CardRepositoryOffline.class);
		Card cardWithId = new Card((long) 5, "type", "Test Name On Card", "1234123412341234", "06/2018", "666", customer);
		cardRepo.persistCard(cardWithId);
		assertNotNull(cardRepo.findById(5));
	}

	@Test
	public void testFindForCustomer() {
		cardRepo = mock(CardRepositoryOffline.class);		
		cardRepo.persistCard(card);
		assertNotNull(cardRepo.findForCustomer(customer));
	}

	@Test
	public void testCheckCustomerCardCSV() {
		cardRepo = mock(CardRepositoryOffline.class);		
		cardRepo.persistCard(card);
		assertNotNull(cardRepo.checkCustomerCardCSV(1, "1234123412341234", "666"));
	}

}

/*
 * @author: Iain Q
 */

package com.qa.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.entities.Card;
import com.qa.tangerinedream.entities.Customer;

public class CardTest {

	Card card = new Card((long)1,"","","","","",new Customer());
	
	@Test
	public void testCard() {
		Card card = new Card();
		assertNotNull(card);
	}

	@Test
	public void testCardStringStringStringStringStringCustomer() {
		Card card = new Card("","","","","",new Customer());
		assertNotNull(card);
	}

	@Test
	public void testCardLongStringStringStringStringStringCustomer() {
		Card card = new Card((long)1,"","","","","",new Customer());
		assertNotNull(card);
	}

	@Test
	public void testGetType() {
		assertNotNull(card.getType());
	}

	@Test
	public void testSetType() {
		card.setType("test");
		assertEquals("test",card.getType());
	}

	@Test
	public void testGetNameOnCard() {
		assertNotNull(card.getNameOnCard());
	}

	@Test
	public void testSetNameOnCard() {
		card.setNameOnCard("test");
		assertEquals("test",card.getNameOnCard());
	}

	@Test
	public void testGetCardNumber() {
		assertNotNull(card.getCardNumber());
	}

	@Test
	public void testSetCardNumber() {
		card.setCardNumber("test");
		assertEquals("test",card.getCardNumber());
	}

	@Test
	public void testGetExpiryDate() {
		assertNotNull(card.getExpiryDate());
	}

	@Test
	public void testSetExpiryDate() {
		card.setExpiryDate("test");
		assertEquals("test",card.getExpiryDate());
	}

	@Test
	public void testGetcSV() {
		assertNotNull(card.getcSV());
	}

	@Test
	public void testSetcSV() {
		card.setcSV("test");
		assertEquals("test",card.getcSV());
	}

	@Test
	public void testGetCustomer() {
		assertNotNull(card.getCustomer());
	}

	@Test
	public void testSetCustomer() {
		Customer customer = new Customer();
		card.setCustomer(customer);
		assertEquals(customer,card.getCustomer());
	}

	@Test
	public void testGetId() {
		
		assertNotNull(card.getId());
	}

}

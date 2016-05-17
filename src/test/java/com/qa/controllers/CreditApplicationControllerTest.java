/**
 * 
 */
package com.qa.controllers;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.tangerinedream.controllers.CreditApplicationController;

/**
 * @author Volodymyr Maksymchuk Team  2016
 *
 */
public class CreditApplicationControllerTest {
	
	//CreditApplicationController testCredit = new CreditApplicationController();

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#apply()}.
	 */
	@Test
	public void testApplyNotNull() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertNotNull(firstCredit);
	}
	
	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#apply()}.
	 */
	@Test
	public void testApplyEqualsWhenEmptyOneInstance() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertEquals(firstCredit.apply(), "CreditApplication");
	}
	
	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#cancel()}.
	 */
	@Test
	public void testCancelIsNotNull() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertNotNull(firstCredit.cancel());
	}
	
	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#cancel()}.
	 */
	@Test
	public void testCancelReturnsString() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertEquals(firstCredit.cancel(), "home");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getSurname()}.
	 */
	@Test
	public void testGetSurnameNotNull() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertNotNull(firstCredit.getSurname());
	}
	
	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getSurname()}.
	 */
	@Test
	public void testGetSurnameIsEmptyString() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		assertEquals(firstCredit.getSurname(), "");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setSurname(java.lang.String)}.
	 */
	@Test
	public void testSetSurnameIsSet() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setSurname("UsersSurname");
		assertEquals("UsersSurname", firstCredit.getSurname());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getFirst_name()}.
	 */
	@Test
	public void testGetFirst_name() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		CreditApplicationController secondCredit = new CreditApplicationController();
		firstCredit.setFirst_name("firstCreditFirstName");
		secondCredit.setFirst_name(firstCredit.getFirst_name());
		assertEquals(firstCredit.getFirst_name(), secondCredit.getFirst_name());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setFirst_name(java.lang.String)}.
	 */
	@Test
	public void testSetFirst_name() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setFirst_name("UsersFirstName");
		assertEquals("UsersFirstName", firstCredit.getFirst_name());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getDate_of_birth()}.
	 */
	@Test
	public void testGetDate_of_birth() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		CreditApplicationController secondCredit = new CreditApplicationController();
		firstCredit.setDate_of_birth("28122000");
		secondCredit.setDate_of_birth(firstCredit.getDate_of_birth());
		assertEquals(firstCredit.getDate_of_birth(), secondCredit.getDate_of_birth());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setDate_of_birth(java.lang.String)}.
	 */
	@Test
	public void testSetDate_of_birth() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setDate_of_birth("28122000");
		assertEquals("28122000", firstCredit.getDate_of_birth());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getHome_address()}.
	 * TODO: continue testing.
	 */
	@Test
	public void testGetHome_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setHome_address(java.lang.String)}.
	 */
	@Test
	public void testSetHome_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getTime_at_address()}.
	 */
	@Test
	public void testGetTime_at_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setTime_at_address(java.lang.String)}.
	 */
	@Test
	public void testSetTime_at_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getPlace_of_birth()}.
	 */
	@Test
	public void testGetPlace_of_birth() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setPlace_of_birth(java.lang.String)}.
	 */
	@Test
	public void testSetPlace_of_birth() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getType_of_proof()}.
	 */
	@Test
	public void testGetType_of_proof() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setType_of_proof(java.lang.String)}.
	 */
	@Test
	public void testSetType_of_proof() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getProof_number()}.
	 */
	@Test
	public void testGetProof_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setProof_number(java.lang.String)}.
	 */
	@Test
	public void testSetProof_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getEmployer_name()}.
	 */
	@Test
	public void testGetEmployer_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setEmployer_name(java.lang.String)}.
	 */
	@Test
	public void testSetEmployer_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getEmployer_address()}.
	 */
	@Test
	public void testGetEmployer_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setEmployer_address(java.lang.String)}.
	 */
	@Test
	public void testSetEmployer_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getTime_with_employer()}.
	 */
	@Test
	public void testGetTime_with_employer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setTime_with_employer(java.lang.String)}.
	 */
	@Test
	public void testSetTime_with_employer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getType_of_employment()}.
	 */
	@Test
	public void testGetType_of_employment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setType_of_employment(java.lang.String)}.
	 */
	@Test
	public void testSetType_of_employment() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getBank_name()}.
	 */
	@Test
	public void testGetBank_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setBank_name(java.lang.String)}.
	 */
	@Test
	public void testSetBank_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getTime_with_bank()}.
	 */
	@Test
	public void testGetTime_with_bank() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setTime_with_bank(java.lang.String)}.
	 */
	@Test
	public void testSetTime_with_bank() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getAccount_number()}.
	 */
	@Test
	public void testGetAccount_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setAccount_number(java.lang.String)}.
	 */
	@Test
	public void testSetAccount_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getSort_code()}.
	 */
	@Test
	public void testGetSort_code() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setSort_code(java.lang.String)}.
	 */
	@Test
	public void testSetSort_code() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getCard_name()}.
	 */
	@Test
	public void testGetCard_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setCard_name(java.lang.String)}.
	 */
	@Test
	public void testSetCard_name() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getCard_number()}.
	 */
	@Test
	public void testGetCard_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setCard_number(java.lang.String)}.
	 */
	@Test
	public void testSetCard_number() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getExpiry_date()}.
	 */
	@Test
	public void testGetExpiry_date() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setExpiry_date(java.lang.String)}.
	 */
	@Test
	public void testSetExpiry_date() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getCvs()}.
	 */
	@Test
	public void testGetCvs() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setCvs(java.lang.String)}.
	 */
	@Test
	public void testSetCvs() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#getBank_address()}.
	 */
	@Test
	public void testGetBank_address() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setBank_address(java.lang.String)}.
	 */
	@Test
	public void testSetBank_address() {
		fail("Not yet implemented");
	}

}

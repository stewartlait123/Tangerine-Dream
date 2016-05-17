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
	 */
	@Test
	public void testGetHome_address() {
		CreditApplicationController firstCredit = new CreditApplicationController();
		CreditApplicationController secondCredit = new CreditApplicationController();
		firstCredit.setHome_address("Line1, Line 2");
		secondCredit.setHome_address(firstCredit.getHome_address());
		assertEquals(firstCredit.getDate_of_birth(), secondCredit.getDate_of_birth());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setHome_address(java.lang.String)}.
	 */
	@Test
	public void testSetHome_address() {
		String testAddress = "12 Green Street";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setHome_address(testAddress);
		assertEquals(testAddress, firstCredit.getHome_address());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getTime_at_address()}.
	 */
	@Test
	public void testSetAndGetTime_at_address() {
		String testTime = "5 years";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setTime_at_address(testTime);
		assertEquals(testTime, firstCredit.getTime_at_address());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getPlace_of_birth(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetPlace_of_birth() {
		String testPlace = "London";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setPlace_of_birth(testPlace);
		assertEquals(testPlace, firstCredit.getPlace_of_birth());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getType_of_proof(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetType_of_proof() {
		String testProof = "Date Of Birth";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setType_of_proof(testProof);
		assertEquals(testProof, firstCredit.getType_of_proof());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getProof_number(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetProof_number() {
		String testProofNum = "0123456789";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setProof_number(testProofNum);
		assertEquals(testProofNum, firstCredit.getProof_number());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#setEmployer_name(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetEmployer_name() {
		String testEmployersName = "EmployersName";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setEmployer_name(testEmployersName);
		assertEquals(testEmployersName, firstCredit.getEmployer_name());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getEmployer_address(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetEmployer_address() {
		String testEmployersAddr = "EmployersAddress";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setEmployer_address(testEmployersAddr);
		assertEquals(testEmployersAddr, firstCredit.getEmployer_address());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getTime_with_employer(java.lang.String)}.
	 */
	@Test
	public void testSetTime_with_employer() {
		String testData = "3 years";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setTime_with_employer(testData);
		assertEquals(testData, firstCredit.getTime_with_employer());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getType_of_employment(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetType_of_employment() {
		String testData = "IT";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setType_of_employment(testData);
		assertEquals(testData, firstCredit.getType_of_employment());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getBank_name(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetBank_name() {
		String testData = "Lloyds TSB";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setBank_name(testData);
		assertEquals(testData, firstCredit.getBank_name());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getTime_with_bank(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetTime_with_bank() {
		String testData = "6 years";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setTime_with_bank(testData);
		assertEquals(testData, firstCredit.getTime_with_bank());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getAccount_number(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetAccount_number() {
		String testData = "4444 3333 2222 5555";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setAccount_number(testData);
		assertEquals(testData, firstCredit.getAccount_number());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getSort_code(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetSort_code() {
		String testData = "22-31-67";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setSort_code(testData);
		assertEquals(testData, firstCredit.getSort_code());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getCard_name(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetCard_name() {
		String testData = "MR JOHN SNOW";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setCard_name(testData);
		assertEquals(testData, firstCredit.getCard_name());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getCard_number(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetCard_number() {
		String testData = "1324 4567 1234 5678";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setCard_number(testData);
		assertEquals(testData, firstCredit.getCard_number());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getExpiry_date(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetExpiry_date() {
		String testData = "17/21";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setExpiry_date(testData);
		assertEquals(testData, firstCredit.getExpiry_date());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getCvs(java.lang.String)}.
	 */ //TODO:
	@Test
	public void testSetAndGetCvs() {
		String testData = "412";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setCvs(testData);
		assertEquals(testData, firstCredit.getCvs());
		assertNotNull(firstCredit.getCvs());
	}

	/**
	 * Test method for {@link com.qa.tangerinedream.controllers.CreditApplicationController#set/getBank_address(java.lang.String)}.
	 */
	@Test
	public void testSetAndGetBank_address() {
		String testData = "13 Greenest Street, Yorkshire";
		CreditApplicationController firstCredit = new CreditApplicationController();
		firstCredit.setBank_address(testData);
		assertEquals(testData, firstCredit.getBank_address());
		assertNotNull(firstCredit.getBank_address());
	}

}

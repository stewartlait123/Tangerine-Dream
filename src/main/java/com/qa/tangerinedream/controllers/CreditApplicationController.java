package com.qa.tangerinedream.controllers;

import javax.ejb.EJB;
//Created by Jessica Maddocks. Credit Application controller: the controller will have the apply and cancel buttons that navigate to a confirmation page and send to Accounts via Mule (JMS) when applied and go to the home page when cancelled.
//For Mule, to receive the form, the application service is created which has the JMS 
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.qa.tangerinedream.service.CreditApplicationService;

@Named(value = "credapplic")
@RequestScoped
public class CreditApplicationController {

	// CAS will be a service layer object to carry the gay away
	@EJB
	private CreditApplicationService creditApplicationService;

	// apply for credit method
	// private for all variables inside the html fill
	private String surname = "";
	private String first_name = "";
	private String date_of_birth = "";
	private String home_address = "";
	private String time_at_address = "";
	private String place_of_birth = "";
	private String type_of_proof = "";
	private String proof_number = "";
	private String employer_name = "";
	private String employer_address = "";
	private String time_with_employer = "";
	private String type_of_employment = "";
	private String bank_name = "";
	private String time_with_bank = "";
	private String account_number = "";
	private String sort_code = "";
	private String card_name = "";
	private String card_number = "";
	private String expiry_date = "";
	private String cvs = "";
	private String bank_address = "";

	// method to return to credit application if any boxes are left empty when clicked apply
	public String apply() {
		System.out.println("not Butts");
		if (surname.isEmpty() || first_name.isEmpty() || date_of_birth.isEmpty() || home_address.isEmpty()
				|| time_at_address.isEmpty() || place_of_birth.isEmpty() || type_of_proof.isEmpty()
				|| proof_number.isEmpty() || employer_name.isEmpty() || employer_address.isEmpty()
				|| time_with_employer.isEmpty() || type_of_employment.isEmpty() || bank_name.isEmpty()
				|| time_with_bank.isEmpty() || account_number.isEmpty() || sort_code.isEmpty() || card_name.isEmpty()
				|| card_number.isEmpty() || expiry_date.isEmpty() || cvs.isEmpty() || bank_address.isEmpty()) {
			System.out.println(toString());//print to check for error that was occurring #BetterToBeSafeThanSorry
			return "CreditApplication";
		}
		// to send to imaginary accounts department via mule using method sendApplication which is contained within the service
		// we don't give a shit m8 coz its a controller, we dont need the logik ere
		creditApplicationService.sendApplication(surname, first_name, date_of_birth, home_address, time_at_address,
					place_of_birth, type_of_proof, proof_number, employer_name, employer_address, time_with_employer,
					type_of_employment, bank_name, time_with_bank, account_number, sort_code, card_name, card_number,
					expiry_date, cvs, bank_address);
		System.out.println("---noemptyFields"); //prints out in the console to say there are no empty fields
		return "CreditConfirmation";
	}
	
	public String cancel() {
		System.out.println("Butts");
		return "home";
	}

	// getters and setters for strings
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getHome_address() {
		return home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}

	public String getTime_at_address() {
		return time_at_address;
	}

	public void setTime_at_address(String time_at_address) {
		this.time_at_address = time_at_address;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public String getType_of_proof() {
		return type_of_proof;
	}

	public void setType_of_proof(String type_of_proof) {
		this.type_of_proof = type_of_proof;
	}

	public String getProof_number() {
		return proof_number;
	}

	public void setProof_number(String proof_number) {
		this.proof_number = proof_number;
	}

	public String getEmployer_name() {
		return employer_name;
	}

	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}

	public String getEmployer_address() {
		return employer_address;
	}

	public void setEmployer_address(String employer_address) {
		this.employer_address = employer_address;
	}

	public String getTime_with_employer() {
		return time_with_employer;
	}

	public void setTime_with_employer(String time_with_employer) {
		this.time_with_employer = time_with_employer;
	}

	public String getType_of_employment() {
		return type_of_employment;
	}

	public void setType_of_employment(String type_of_employment) {
		this.type_of_employment = type_of_employment;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getTime_with_bank() {
		return time_with_bank;
	}

	public void setTime_with_bank(String time_with_bank) {
		this.time_with_bank = time_with_bank;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getSort_code() {
		return sort_code;
	}

	public void setSort_code(String sort_code) {
		this.sort_code = sort_code;
	}

	public String getCard_name() {
		return card_name;
	}

	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getCvs() {
		return cvs;
	}

	public void setCvs(String cvs) {
		this.cvs = cvs;
	}

	public String getBank_address() {
		return bank_address;
	}

	public void setBank_address(String bank_address) {
		this.bank_address = bank_address;
	}

}

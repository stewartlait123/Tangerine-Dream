package com.qa.tangerinedream.service;

import java.io.Serializable;

import javax.ejb.MessageDriven;

@MessageDriven
public class Application implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4104281045024394123L;
	private String surname;
	private String first_name;
	private String date_of_birth;
	private String home_address;
	private String time_at_address;
	private String place_of_birth;
	private String type_of_proof;
	private String proof_number;
	private String employer_name;
	private String employer_address;
	private String time_with_employer;
	private String type_of_employment;
	private String bank_name;
	private String time_with_bank;
	private String account_number;
	private String sort_code;
	private String card_name;
	private String card_number;
	private String expiry_date;
	private String cvs;
	private String bank_address;
	
	public Application(String surname, String first_name, String date_of_birth, String home_address,
			String time_at_address, String place_of_birth, String type_of_proof, String proof_number,
			String employer_name, String employer_address, String time_with_employer, String type_of_employment,
			String bank_name, String time_with_bank, String account_number, String sort_code, String card_name,
			String card_number, String expiry_date, String cvs, String bank_address) {
		this.surname = surname;
		this.first_name = first_name;
		this.date_of_birth = date_of_birth;
		this.home_address = home_address;
		this.time_at_address = time_at_address;
		this.place_of_birth = place_of_birth;
		this.type_of_proof = type_of_proof;
		this.proof_number = proof_number;
		this.employer_name = employer_name;
		this.employer_address = employer_address;
		this.time_with_employer = time_with_employer;
		this.type_of_employment = type_of_employment;
		this.bank_name = bank_name;
		this.time_with_bank = time_with_bank;
		this.account_number = account_number;
		this.sort_code = sort_code;
		this.card_name = card_name;
		this.card_number = card_number;
		this.expiry_date = expiry_date;
		this.cvs = cvs;
		this.bank_address = bank_address;
	}
	

	public String getSurname() {
		return surname;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public String getHome_address() {
		return home_address;
	}

	public String getTime_at_address() {
		return time_at_address;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public String getType_of_proof() {
		return type_of_proof;
	}

	public String getProof_number() {
		return proof_number;
	}

	public String getEmployer_name() {
		return employer_name;
	}

	public String getEmployer_address() {
		return employer_address;
	}

	public String getTime_with_employer() {
		return time_with_employer;
	}

	public String getType_of_employment() {
		return type_of_employment;
	}

	public String getBank_name() {
		return bank_name;
	}

	public String getTime_with_bank() {
		return time_with_bank;
	}

	public String getAccount_number() {
		return account_number;
	}

	public String getSort_code() {
		return sort_code;
	}

	public String getCard_name() {
		return card_name;
	}

	public String getCard_number() {
		return card_number;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public String getCvs() {
		return cvs;
	}

	public String getBank_address() {
		return bank_address;
	}
}
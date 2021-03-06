package com.qa.tangerinedream.entities;

/**
 * POJO for credit application, entity not required as Cred app won't be going to database. Will be sent to accounts via mule account system
 * @author Jessica Maddocks 2k16.
 *
 */

public class CreditApplication {
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
	

	//getters and setters for strings
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

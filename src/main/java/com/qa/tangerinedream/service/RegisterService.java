package com.qa.tangerinedream.service;

import java.sql.Date;
import java.util.Calendar;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.repositories.CustomerRepository;

public class RegisterService {

	@Inject CustomerRepository customerRepo;
	
	public void addCustomer(Customer customer) {
		customerRepo.addCustomer(customer);
	}

	public boolean ValidateDetails(String name, String username, String password, String confirmPassword, Date dob) {
		if (name != "" || username != "" || password != "" || confirmPassword != "" || validateDate(dob))
		{
			return true;
		}
		return false;
	}
	
	private boolean validateDate(Date value){
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		cal.setTime(value);
		try {
		    cal.getTime();
		    return true;
		}
		catch (Exception e) {
		  return false;
		}
	}
}

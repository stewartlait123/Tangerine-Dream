package com.qa.tangerinedream.service;

import java.util.Date;

import javax.inject.Inject;

import com.qa.tangerinedream.entities.Customer;
import com.qa.tangerinedream.entities.Order;
import com.qa.tangerinedream.repositories.CustomerRepository;

public class CustomerService {
	@Inject CustomerRepository customerRepo;
	@Inject RegisterService  registerService;
	
	public Order getWishList(long userID){
		//TODO: get the wish list for the specified customer
		return null;
	}
	
	public void changeName(long userID, String newName){
		//TODO: Change the users name
	}

	public void changeEmail(long userID, String newEmail){
		//TODO: Change the users E-mail
	}

	public void changePassword(long userID, String newPassword){
		//TODO: Change the users password
	}

	public void addAddress(long userID, String newAddress){
		//TODO: Add a new Address
	}

	public boolean validateDetails(String username, String password) {
		
		Customer customer = customerRepo.findByUserPass(username, password);
		if(customer != null)
		{			
			return true;
		}
		return false;
		
	}
	
	public boolean validateDetails(String name, Date date){		
		if (name != "" && registerService.validateDate(date))
		{
			return true;
		}
		return false;
	}
	
	public long findUserIdByUsername(String username){
		 
		return customerRepo.findUserIdByUsername(username.toLowerCase());
	}

	public Customer findUserByUsername(String username) {
		return customerRepo.findUserByUsername(username);
	}

	public Customer findUserById(long userid) {
		// TODO Auto-generated method stub
		return customerRepo.findByID(userid);
	}
}

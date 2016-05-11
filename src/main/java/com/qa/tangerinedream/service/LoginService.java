// Created by Mohammed Miah, April 2016
package com.qa.tangerinedream.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.qa.tangerinedream.repositories.CustomerRepository;

@Stateless
public class LoginService {
	@Inject CustomerRepository customerRepo;
	
	public static boolean validateUser(String username, String password){
		boolean userValid = false;
		
		//TODO: next check the database to authenticate the user.
		
		// If user was not found, return false.
		return false;
	}
	
	public void Logout(){
		// TODO: Log out the user by destroying all data held about them in the current session.
	}

}

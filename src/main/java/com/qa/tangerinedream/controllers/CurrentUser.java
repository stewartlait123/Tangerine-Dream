package com.qa.tangerinedream.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class CurrentUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6550704034146760260L;

	private long userID;
	
	protected long getUserID() {
		return userID;
	}

	public void setUser(long findUserIdByUsername) {
		// TODO Auto-generated method stub
		
	}
}

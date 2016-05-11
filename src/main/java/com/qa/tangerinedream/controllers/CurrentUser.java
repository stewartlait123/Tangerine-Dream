package com.qa.tangerinedream.controllers;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class CurrentUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6550704034146760260L;

	private long userID;
	
	protected long getUserID() {
		System.out.println(userID);
		return userID;
	}

	protected void setUserID(long userID) {
		System.out.println(userID);
		this.userID = userID;
	}
}

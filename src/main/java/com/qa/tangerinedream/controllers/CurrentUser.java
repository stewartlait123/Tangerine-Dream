package com.qa.tangerinedream.controllers;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class CurrentUser {
/*	private long userID;*/
	
	protected long getUserID() {
		return hashCode();
	}
}

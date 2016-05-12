package com.qa.tangerinedream.controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.qa.tangerinedream.service.CustomerService;


@Named(value="logout")
@SessionScoped

public class logoutController {
	@Inject CustomerService customerService;

}

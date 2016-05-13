package com.qa.tangerinedream.service;

import java.util.Calendar;
import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class DateValidator {
	public boolean validateDate(String dateToValidate) {
		Date currentDate = 	Calendar.getInstance().getTime();
		String year = dateToValidate.substring(3);
		String month = dateToValidate.substring(0, 2);
		if(Integer.parseInt(year) >= Integer.parseInt(currentDate.toString().substring(currentDate.toString().length()-2)))
			if(Integer.parseInt(month) >= getMonth(currentDate.toString().substring(4, 7)))
				return true;
		return false;
	}
	
	private int getMonth(String month) {
		switch (month) {
		case "Jan":
			return 1;
		case "Feb":
			return 2;
		case "Mar":
			return 3;
		case "Apr":
			return 4;
		case "May":
			return 5;
		case "Jun":
			return 6;
		case "Jul":
			return 7;
		case "Aug":
			return 8;
		case "Sep":
			return 9;
		case "Oct":
			return 10;
		case "Nov":
			return 11;
		case "Dec":
			return 12;
		}
		return 0;
	}
}

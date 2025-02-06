package com.ignek.employee.mangement.util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static boolean checkNull(String value) {
		if (value.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches() == false) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPhone(String phone) {
		if (phone.length() > 10 || phone.length() < 10) {
			return true;
		} else {
			try {
				Long.parseLong(phone);
				return false;
			} catch (NumberFormatException numberFomatException) {
				throw new NumberFormatException("Invalid Phone");
			}
		}
	}

	public static boolean checkBirthdate(String birthdate) {
		LocalDate now = LocalDate.now();

		try {
			LocalDate date = LocalDate.parse(birthdate);
			if (date.isAfter(now)) {
				return true;
			} else {
				return false;
			}
		} catch (DateTimeException dateTimeException) {
			throw new DateTimeException("Invalid Birthdate");
		}
	}

	public static boolean checkPassword(String password) {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		if (matcher.matches() == false) {
			return true;
		} else {
			return false;
		}
	}

}

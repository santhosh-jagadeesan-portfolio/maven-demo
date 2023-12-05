package com.santhoshjagadeesan;

import java.util.ResourceBundle;

public class Login {

	public int login(String actual_username, String actual_password) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String expected_username = rb.getString("username");
		String expected_password = rb.getString("password");
		if (actual_username.equals(expected_username) && actual_password.equals(expected_password)) {
			return 1;
		} else {
			return 0;
		}
	}

}

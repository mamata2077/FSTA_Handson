package com.agile.TDDProject;

import java.util.HashMap;
import java.util.Map;

public class AccountCreation {

	Map<String,String> credentials = new HashMap<String,String>();

	public String createAccount(String username, String password) {
		if (!isUserNameValid(username)   || !isValidPassword(password)){
			return "Account creation failed";
		}
		credentials.put(username,password);
		return "Account created successfully";
	}

	private boolean isUserNameValid(String username){
		if(username == null || username.equals("") || !(username.matches("^[a-zA-Z]*$"))){
			return false;
		}
		return true;	
	}

	private boolean isValidPassword(String password){
		if (password == null || password.equals("") ||  !(password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$"))){
			return false;
		}
		return true;
	
	}

}

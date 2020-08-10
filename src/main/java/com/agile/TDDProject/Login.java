package com.agile.TDDProject;

public class Login {
    AccountCreation accountCreation;
    Login(AccountCreation accountCreation)
    {
        this.accountCreation = accountCreation;
    }

   	public String login(String userName, String password) {
		if(!isValidCredential(userName,password))
		{
			return "Login failed";
		}
		return "Login is Successful";
	}

	private boolean isValidCredential(String userName, String password)
	{
		
		if(!(accountCreation.credentials.containsKey(userName)) || !(password.equals((accountCreation.credentials.get(userName)))))
		{
		return false;
		}
		return true;
	}

}
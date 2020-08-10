package com.agile.TDDProject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    public  AccountCreation creationObj;
    public Login loginObj ;
    @Before
    public  void class_Level_Setup(){
        creationObj = new AccountCreation();
        loginObj = new Login(creationObj);
        creationObj.createAccount("mamata","system123");
    }
    

    @Test
    public void shouldReturnSuccessMessageForCorrectUserNameAndPasswordForLogin(){
        
        //Act
        String result = loginObj.login("mamata","system123");

        //Assert
        assertEquals("Login is Successful", result);
    }

    @Test
    public void shouldReturnFailureMessageWithIncorrectUserNameAndCorrectPasswordForLogin(){
             
        //Act
        String result = loginObj.login("john","system123");

        //Assert
        assertEquals("Login failed", result);
    }

    @Test
    public void shouldReturnFailureMessageWithValidUserNameAndInvalidPasswordForLogin(){
         
        //Act
         String result = loginObj.login("mamata","test");

         //Assert
         assertEquals("Login failed", result);

    }
}
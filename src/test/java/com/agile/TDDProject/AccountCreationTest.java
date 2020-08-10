package com.agile.TDDProject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountCreationTest {
    public  AccountCreation creationObj;
    @Before
    public  void class_Level_Setup(){
        creationObj = new AccountCreation();
    }
    
    @Test
    public void shouldGetSuccessmessageWithValidUserNameAndPasswordWhileCreatingAccount(){
   
        // Act
          String result = creationObj.createAccount("mamata", "system123");

        // Assert
        assertEquals("Account created successfully", result);

    }

    @Test
    public void shouldGetFailureMessageWhenuserIdIsNullWhileCreatingAccount()
    {
        //Act
        String result = creationObj.createAccount(null, "pass123");

        // Assert
        assertEquals("Account creation failed", result);
    }

    @Test
    public void shouldGetFailureMessageWhenUserIdIsEmptyWhileCreatingAccount(){
        //Act
        String result = creationObj.createAccount("", "pass123");

        // Assert
        assertEquals("Account creation failed", result);

    }

    @Test
    public void shouldGetFailureMessageWhenPasswordIsNullWhileCreatingAccount(){
         //Act
         String result = creationObj.createAccount("mamata", null);

         // Assert
         assertEquals("Account creation failed", result);

    }

    @Test
    public void shouldGetFailureMessageWhenPasswordIsEmptyWhileCreatingAccount(){
            //Act
            String result = creationObj.createAccount("mamata", "");

            // Assert
            assertEquals("Account creation failed", result);
    }

    @Test
    public void shouldGetFailureMessageWhenUserIdContainsSpcialCharactersOrNumberalsWhileCreatingAccount(){
         //Act
         String result = creationObj.createAccount("mamata*&", "system123");

         // Assert
         assertEquals("Account creation failed", result);

    }

    @Test
    public void shouldGetFailureMessageWhenPasswordIsLessThanSixCharactersWhileCreatingAccount(){
        //Act
        String result = creationObj.createAccount("mamata", "test");

        //Assert
        assertEquals("Account creation failed", result);
    }

    @Test
    public void shouldGetFailureMessageWhenPasswordDoesNotContainAnyAlphabetWhileCreatingAccount(){
        //Act
        String result = creationObj.createAccount("mamata", "123456");

        //Assert
        assertEquals("Account creation failed", result);
    }

    

    

}
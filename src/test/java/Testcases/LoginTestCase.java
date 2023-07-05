package Testcases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import bsh.org.objectweb.asm.Constants;

public class LoginTestCase extends BaseClass {

	@Test(dataProvider="testData")
	public void verifyLogin(String username,String password) throws IOException {
		
	LoginPageObjects lpo = new LoginPageObjects (driver);
	
	lpo.enterUsername().sendKeys(username);
	lpo.enterPassword().sendKeys(password);
	lpo.ClickOnLogin().click();
	
	
	CommonMethods.verifyAssertions(lpo.errorMessage(),constants.expectedTextErrorMessage,"Valid Error message is not showing");     
	}
	
	 @DataProvider
	 public Object[][] testData () {   //testData() - is dataprovider name
	  Object[][] data=new Object[3][2]; //create the object of object class
	  data[0][0]=Constants.username1; //1st username
	  data[0][1]=Constants.password1;// 1st password
	  data[1][0]=Constants.username2; //2nd username
	  data[1][1]=Constants.password2; //2nd password
	  data[2][0]=Constants.username3; //3rd username
	  data[2][1]=Constants.password3;  //3rd password
	  
	  return data;
	  
	 }
	 
	}



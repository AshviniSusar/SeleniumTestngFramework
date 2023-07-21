package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import Resources.BaseClass;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.CommonMethods;
import Resources.Constants;

public class SignupTestCases extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {
	
	LoginPageObjects lpo = new LoginPageObjects(driver);
	lpo.clickOntryForFree().click();
	
	SignupPageObjects spo = new SignupPageObjects(driver);
	
	Thread.sleep(5000);
	
	spo.enterFirstName().sendKeys(Constants.FirstName);
	
	spo.enterLastName().sendKeys(Constants.LastName);
	
	spo.enterJobTitle().sendKeys(Constants.jobTitle);
	
	spo.ClickOnNextButton().click();
	
	CommonMethods.selectDropdown(spo.SelectEmployees(), 2); //employee dropdown
	spo.enterCompanyName().sendKeys("test");
	
	CommonMethods.selectDropdown(spo.SelectCountry(), 4);
	
	//CommonMethods.selectDropdownWithVisibleText(spo.selectCountry(),"india");
	spo.ClickOnNextButton().click();
	
	
	  CommonMethods.verifyAssertions(spo.signupPageConfirmation(),Constants.expectedTextSignupText,"valid signup text is not showing");     
}
}
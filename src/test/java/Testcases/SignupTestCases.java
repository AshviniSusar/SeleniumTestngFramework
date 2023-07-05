package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.CommonMethods;

public class SignupTestCases extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {
	
	LoginPageObjects lpo = new LoginPageObjects(driver);
	lpo.clickOntryForFree().click();
	
	SignupPageObjects spo = new SignupPageObjects(driver);
	
	Thread.sleep(5000);
	
	spo.enterFirstName().sendKeys(Constants.FirstName);
	
	spo.enterLastName().sendKeys(Constants.LastName);
	
	spo.enterJobTitle().sendKeys(Constants.JobTitle);
	
	spo.ClickOnNextButton().click();
	
	CommonMethods.selectDropdown(spo.SelectEmployees(), 2); //employee dropdown
	spo.enterCompanyName().sendKeys("test");
	
	CommonMethods.selectDropdown(spo.SelectCountry(), 4);
	
	//CommonMethods.selectDropdownWithVisibleText(spo.selectCountry(),"india");
	spo.ClickOnNextButton().click();
	
	
	  CommonMethods.verifyAssertions(spo.signupPageConfirmation(),constants.expectedTextSignupText,"valid signup text is not showing");     
}
}
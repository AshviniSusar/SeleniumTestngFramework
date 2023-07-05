package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	public WebDriver driver;

	private By FirstName = By.xpath("//input[@name='UserFirstName']");

	private By LastName = By.xpath("//input[@name='UserLastName']");

	private By JobTitle = By.xpath("//input[@name='UserTitle']");

	private By NextButton = By.xpath("//span[contains(text(),'next')]");

	private By SelectEmployee = By.xpath("//select[@name='CompanyEmployees']");

	private By SelectCountry = By.xpath("//select[@name='CompanyCountry']");

	private By CompanyName = By.xpath("//input[@name='CompanyName']");

	private By signupPageConfirmation = By
			.xpath("//h2[@id='answer-2-more-questions-and-well-get-you-into-your-free-trial']");

	public SignupPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterFirstName() {
		return driver.findElement(FirstName);

	}

	public WebElement enterLastName() {
		return driver.findElement(LastName);

	}

	public WebElement enterJobTitle() {
		return driver.findElement(JobTitle);

	}

	public WebElement ClickOnNextButton() {
		return driver.findElement(NextButton);

	}

	public WebElement SelectEmployees() {
		return driver.findElement(SelectEmployee);

	}

	public WebElement SelectCountry() {
		return driver.findElement(SelectCountry);
	}

	public WebElement enterCompanyName() {
		return driver.findElement(CompanyName);
	}

	public WebElement signupPageConfirmation() {
		return driver.findElement(signupPageConfirmation);

	}
}

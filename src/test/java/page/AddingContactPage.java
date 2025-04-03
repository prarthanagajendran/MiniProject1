package page;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecifiedMethod;

public class AddingContactPage extends ProjectSpecifiedMethod {

	@FindBy(id = "firstName")
	WebElement firstname;
	@FindBy(id = "lastName")
	WebElement lastname;
	@FindBy(id = "phone")
	WebElement Phnumber;
	@FindBy(id = "country")
	WebElement country;
	@FindBy(id = "stateProvince")
	WebElement state;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "email")
	WebElement mail;
	@FindBy(id = "birthdate")
	WebElement DOB;
	@FindBy(id = "postalCode")
	WebElement PINnumber;
	@FindBy(id = "street1")
	WebElement address1;
	@FindBy(id = "street2")
	WebElement address2;
	@FindBy(id = "submit")
	WebElement submit;
	@FindBy(id = "error")
	WebElement Submiterror;
	@FindBy(xpath = "//span[text()='Contact validation failed: birthdate: Birthdate is invalid']")
	WebElement DOBerror;
	@FindBy(id = "success-message")
	WebElement successMessage;

	public AddingContactPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AddingContactPage frstname(String Firstname) {
		firstname.sendKeys(Firstname);
		return this;
	}

	public AddingContactPage lastname(String Lastname) {
		lastname.sendKeys(Lastname);
		return this;
	}

	public AddingContactPage dob(String DateofBirth) {
		DOB.sendKeys(DateofBirth);
		return this;
	}

	public AddingContactPage mail(String Mail) {
		mail.sendKeys(Mail);
		return this;
	}

	public AddingContactPage number(String Number) {
		Phnumber.sendKeys(Number);
		return this;
	}

	public AddingContactPage address1(String Address1) {
		address1.sendKeys(Address1);
		return this;
	}

	public AddingContactPage address2(String Address2) {
		address2.sendKeys(Address2);
		return this;
	}

	public AddingContactPage city(String City) {
		city.sendKeys(City);
		return this;
	}

	public AddingContactPage state(String State) {
		state.sendKeys(State);
		return this;
	}

	public AddingContactPage PinNumber(String PINno) {
		PINnumber.sendKeys(PINno);
		return this;
	}

	public AddingContactPage country(String Country) {
		country.sendKeys(Country);
		return this;
	}

	public String getSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated((By) successMessage)).getText();

	}

	public ContactListpage SubmitAddcontact() {
		submit.click();
        return new ContactListpage(driver);
	}

}
package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.ProjectSpecifiedMethod;

public class Contactdetailpage extends ProjectSpecifiedMethod {

	@FindBy(id = "edit-contact")
	WebElement editcontact;
	@FindBy(id = "delete")
	WebElement deletecontact;
	@FindBy(id = "return")
	WebElement returncontact;
	@FindBy(xpath = "//h1[text()='Contact Details']")
	WebElement contactdetailsTitle;

	public Contactdetailpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public EditContactpage editButton() {
		editcontact.click();
		return new EditContactpage(driver);
	}

	public ContactListpage deletebutton() {
		deletecontact.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		return new ContactListpage(driver);
	}

	public Contactdetailpage verifycontactDetail() {
		Assert.assertTrue(contactdetailsTitle.isDisplayed(), "The Page is not redirected to the Contact Detail page");
		return this;
	}

	public ContactListpage returnbutton() {
		returncontact.click();
		return new ContactListpage(driver);
	}

}
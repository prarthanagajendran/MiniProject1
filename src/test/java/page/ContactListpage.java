package page;
 
 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecifiedMethod;
 
 
 public class ContactListpage extends ProjectSpecifiedMethod{
 	
 	@FindBy(id = "add-contact")
 	WebElement contactaddition;
 	
 	@FindBy(xpath = "//button[text()='Logout']")
 	WebElement Logout;
 	
 	@FindBy(xpath ="//h1[text()='Contact List']")////h1[normalize-space()='Contact List']
 	WebElement ContactlistTitle;
 	
 	@FindBy(xpath = "//td[normalize-space()='sai shaswat']")////td[normalize-space()='sai shaswat']
 	WebElement contact1;
 	
 	
 
 	public ContactListpage(WebDriver driver) {
 		// TODO Auto-generated constructor stub
 		this.driver = driver;
 		PageFactory.initElements(driver,this );
 	}
 	
 	public ContactListpage verifycontactListTitle() {
 		if(ContactlistTitle.isDisplayed()) {
 			System.out.println("The ContactList title is Displayed");
 		}else {
 			System.out.println("The ContactList title is not Displayed invalid username and password");
 		}
 		return this;
 	}
 	
 	public ContactListpage listingcontacts() {
 		
 		Assert.assertTrue(contact1.isDisplayed(),"The contact1 is not displayed got deleted");
 		return this;
 	}
 	
 	public AddingContactPage contactadd() {
 		 contactaddition.click();
 		 return new AddingContactPage(driver);
 	 }
 	public ContactListpage contact1Click() {
 		contact1.click();
 		return new ContactListpage(driver);
 	}
 	public Loginpage Logout() {
 		Assert.assertTrue(Logout.isDisplayed(),"The Logout button is not displayed");
 		Logout.click();
 		return new Loginpage(driver);
 	}
    public void deletebutton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("delete"))); 
    }
 
 }
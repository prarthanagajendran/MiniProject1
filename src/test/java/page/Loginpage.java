package page;
 
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
 import org.testng.Assert;

import base.ProjectSpecifiedMethod;
 
 
 public class Loginpage extends ProjectSpecifiedMethod{
 	
 	@FindBy(id = "signup")
 	WebElement signup;
 	@FindBy(id ="email")
 	WebElement Mail;
 	@FindBy(id = "password")
 	WebElement Pass;
 	@FindBy(id = "submit")
 	WebElement Submit;
 	@FindBy(xpath = "//p[text()='Log In:']")
 	WebElement LoginTitle;
 	
 	
 	public Loginpage(WebDriver driver) {
 		this.driver = driver;
 		PageFactory.initElements(driver,this );
 	}
 	
 	public SignupPage clicksignup() {
 		Assert.assertTrue(signup.isDisplayed(), "Signup button is not displayed");
 		Assert.assertTrue(signup.isEnabled(), "Signup button is not enabled");
 		signup.click();
 		return new SignupPage(driver);
 	}
     public Loginpage username(String Username) {
 		Mail.sendKeys(Username);
 		return this;
 	}
 	
 	public Loginpage password(String Password)  {
 		Pass.sendKeys(Password);
 		return this;
 	}
 	
 	public Loginpage logintitle() {
 		if(LoginTitle.isDisplayed()) {
 			System.out.println("The Login title is displayed");
 		}else {
 			System.out.println("The Login title is not displayed");
 		}
 		return this;
 	}
 	
 	public ContactListpage Click() {
 		Assert.assertTrue(Submit.isDisplayed(), "LoginSubmit button is not displayed");
 		Assert.assertTrue(Submit.isEnabled(), "LoginSubmit button is not enabled");
 		Submit.click();
 		return new ContactListpage(driver);
 	}
 
 }
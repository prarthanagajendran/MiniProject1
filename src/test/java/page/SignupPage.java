package page;
 
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
 import org.testng.Assert;
 
import base.ProjectSpecifiedMethod;
 
 public class SignupPage extends ProjectSpecifiedMethod {
 	@FindBy(id="firstName")
 	WebElement frstname;
 	@FindBy(id="lastName")
 	WebElement lasname;
 	@FindBy(id="email")
 	WebElement mail;
 	@FindBy(id="password")
 	WebElement pass;
 	@FindBy(id="submit")
 	WebElement submit1;
 	@FindBy(xpath = "//h1[text()='Add User']")
 	WebElement Adduser;
 
 	public SignupPage(WebDriver driver) {
 		// TODO Auto-generated constructor stub
 		this.driver = driver;
 		PageFactory.initElements(driver,this );
 	}
 	public  SignupPage frstname1(String Firstname) {
 		frstname.sendKeys(Firstname);
 		return this;
 	}
 	public  SignupPage Lastname1(String Lastname) {
 		lasname.sendKeys(Lastname);
 		return this;
 	}
 	public  SignupPage Mail1(String Mail) {
 		mail.sendKeys(Mail);
 		return this;
 	}
 	public  SignupPage Pass1(String Password) {
 		 pass.sendKeys(Password);
 		return this;
 	}
 	
 	public  ContactListpage Submit1() {
 		submit1.click();
 		return new ContactListpage(driver);
 	}
 	
 
 	
 
 }
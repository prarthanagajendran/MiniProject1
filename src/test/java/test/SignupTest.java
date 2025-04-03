package test;
 
 import org.testng.Assert;
import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

import base.ProjectSpecifiedMethod;
import page.Loginpage;
import page.SignupPage;
 
 public class SignupTest extends ProjectSpecifiedMethod{
 	
 	@BeforeTest
 	public void setup() {
 		    sheetname="SignupData";
 		    testName="Signup Test";
			testDescription="Testing the Signup functionality with positive and negative cases";
			testAuthor="prarthana";
			testCategory="Smoke Testing";
	}
 	
 	
 	@Test(priority=1,dataProvider = "excelRead")
 	public void validSignupTest(String Firstname,String Lastname , String Mail,String Password,String Firstname1,String Lastname1 , String Mail1,String Password1) {
 		Loginpage objHomeandloginPage = new Loginpage(driver);
 		objHomeandloginPage.clicksignup();
 		SignupPage objSignupPage = new SignupPage(driver);
 		objSignupPage
 		.frstname1(Firstname)
 		.Lastname1(Lastname)
 		.Mail1(Mail)
 		.Pass1(Password)
 		.Submit1();
        Assert.assertEquals(driver.getCurrentUrl().contains("https://thinking-tester-contact-list.herokuapp.com/contactList"), false);

 		
 		
 	}
 	@Test(priority=1,dataProvider = "excelRead")
 	public void invalidSignupTest(String Firstname,String Lastname , String Mail,String Password,String Firstname1,String Lastname1 , String Mail1,String Password1) {
 		Loginpage objHomeandloginPage = new Loginpage(driver);
 		objHomeandloginPage.clicksignup();
 		SignupPage objSignupPage = new SignupPage(driver);
 		objSignupPage
 		.frstname1(Firstname1)
 		.Lastname1(Lastname1)
 		.Mail1(Mail1)
 		.Pass1(Password1)
 		.Submit1();
        Assert.assertEquals(driver.getCurrentUrl().contains("User validation failed: email: Email is invalid"), false);

 		
 		
 	}
 	
 
 }
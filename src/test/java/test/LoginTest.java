package test;
 
 import org.testng.Assert;
import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

import base.ProjectSpecifiedMethod;
import page.Loginpage;
 import page.ContactListpage;
 
 public class LoginTest extends ProjectSpecifiedMethod{
 	
 	@BeforeTest
 	public void setup() {
 		    sheetname="LoginData";
 		    testName="Login Test";
			testDescription="Testing the Login functionality with positive and negative cases";
			testAuthor="prarthana";
			testCategory="Smoke Testing";
	}
 	
 	
 	@Test(priority=1,dataProvider = "excelRead")
 	 public void valiLoginTest(String Username , String Password, String InvalidUsername,String Invalidpassword) throws InterruptedException  {
 		 Loginpage objHomeandloginPage= new Loginpage(driver);
 		 objHomeandloginPage.username(Username)
 		 .password(Password)
 		 .Click();
 		 Thread.sleep(2000);
         Assert.assertTrue(driver.getCurrentUrl().contains("https://thinking-tester-contact-list.herokuapp.com/contactList"));
 		 }
	@Test(priority=2,dataProvider = "excelRead")
	 public void InvalidLoginTest(String Username , String Password,String InvalidUsername,String Invalidpassword)  {
		 Loginpage objHomeandloginPage= new Loginpage(driver);
		 objHomeandloginPage.username(InvalidUsername)
		 .password(Invalidpassword)
		 .Click();
		 Assert.assertTrue(driver.getCurrentUrl().contains("https://thinking-tester-contact-list.herokuapp.com/"));

		 }
 
 }
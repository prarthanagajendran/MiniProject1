package test;
 
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

import base.ProjectSpecifiedMethod;
import page.Loginpage;
 import page.Contactdetailpage;
 import page.ContactListpage;
 
 public class DeleteContactTest extends ProjectSpecifiedMethod{
 	
 	@BeforeTest
 	public void setup() {
 		    sheetname="LoginData";
 		    testName="DeleteContactTest";
			testDescription="Testing the DeleteContact functionality with positive and negative cases";
			testAuthor="prarthana";
			testCategory="Smoke Testing";
	}
 	
 	
 	@Test(dataProvider = "excelRead")
 	public void contactDelete(String Username , String Password,String InvalidUsername,String Invalidpassword) throws Exception {
 		Loginpage objHomeAndLoginpage = new Loginpage(driver);
 		objHomeAndLoginpage.username(Username).password(Password).Click();
 		ContactListpage objContactListpage = new ContactListpage(driver);
     	Thread.sleep(5000);
     	objContactListpage.contact1Click()
     	.deletebutton();
 		
 	}
 
 }
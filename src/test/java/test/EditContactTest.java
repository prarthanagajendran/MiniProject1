package test;
 
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;

import base.ProjectSpecifiedMethod;
import page.EditContactpage;
 import page.Loginpage;
 import page.Contactdetailpage;
 import page.ContactListpage;
 
 public class EditContactTest extends ProjectSpecifiedMethod{
 	@BeforeTest
 	public void setup() {
 		    sheetname="LoginData";
 		    testName="EditContact Test";
			testDescription="Testing the EditContact functionality with positive and negative cases";
			testAuthor="prarthana";
			testCategory="Smoke Testing";
	}
 	
 	
 	@Test(dataProvider = "excelRead")
 	
 	public void contactEdit(String Username , String Password,String InvalidUsername,String Invalidpassword) throws Exception {
 		Loginpage objHomeandloginPage= new Loginpage(driver);
 		 objHomeandloginPage.username(Username)
 		 .password(Password)
 		 .Click();
 		ContactListpage objContactListpage = new ContactListpage(driver);
 		objContactListpage.contact1Click();
 		Contactdetailpage objContactDetailspage = new Contactdetailpage(driver);
 		objContactDetailspage.editButton();
 		Thread.sleep(5000);		
 		EditContactpage objEditContactpage = new EditContactpage(driver);
 		objEditContactpage.editphnumber();
 		Thread.sleep(4000);
 		objEditContactpage.Submitedtit();
 		
 	}
 
 }
package test;
 
import base.ProjectSpecifiedMethod;
import page.AddingContactPage;
 import page.Loginpage;
 import page.ContactListpage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;
 
 public class AddingContactTest extends ProjectSpecifiedMethod{
 	@BeforeTest
 	public void setup() {
 		    sheetname="AddingcontactData";
 		    testName="AddingContact Test";
			testDescription="Testing the AddingContact functionality with positive and negative cases";
			testAuthor="prarthana";
			testCategory="Smoke Testing";
	}
 	
 	
 	@Test(dataProvider = "excelRead")
 	public void addcontact(String Username , String Password ,String Firstname,String Lastname ,String Address1,String Address2,String City,String Country,String DOB,String Mail,String Number, String PINnumber,String State) throws Exception {
 		Loginpage objHomeAndLoginpage = new Loginpage(driver);
 		objHomeAndLoginpage.username(Username).password(Password).Click();
 		Thread.sleep(3000);
 		ContactListpage objContactListpage = new ContactListpage(driver);
 		objContactListpage.contactadd();
 		AddingContactPage objAddcontactpage = new AddingContactPage(driver);
 		Thread.sleep(3000);
 		objAddcontactpage.frstname(Firstname)
 		.lastname(Lastname)
 		.dob(DOB)
 		.mail(Mail)
 		.number(Number)
 		.address1(Address1)
        .address2(Address2)
 		.city(City)
 		.state(State)
        .PinNumber(PINnumber)
 		.country(Country);

 		Thread.sleep(5000);
 		objAddcontactpage.SubmitAddcontact();
 		Thread.sleep(5000);

 	}
 
 }
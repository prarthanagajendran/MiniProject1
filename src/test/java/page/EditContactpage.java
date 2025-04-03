package page;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifiedMethod;
	 
	 
	 public class EditContactpage extends ProjectSpecifiedMethod {
	 	
	 	@FindBy(xpath = "//input[@id='phone']")
	 	WebElement editphnum;
	 	@FindBy(id = "submit")
	 	WebElement editsubmit;
	 
	 	public EditContactpage(WebDriver driver) {
	 		// TODO Auto-generated constructor stub
	 		this.driver = driver;
	 		PageFactory.initElements(driver,this );
	 	}
	 	
	 	public EditContactpage editphnumber() {
	 		editphnum.clear();
	 		return this;
	 	}
	 	public Contactdetailpage Submitedtit() {
	 		editsubmit.click();
	 		return new Contactdetailpage(driver);
	 	}
	 
	 }
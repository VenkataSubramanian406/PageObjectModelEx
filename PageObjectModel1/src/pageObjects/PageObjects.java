package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	public static WebElement LoginName ; //directly found without using @findby
	
	@FindBy (id="OriginalPassword")
	public static WebElement password ;
	
	@FindBy (id="btnsignin")
	public static WebElement signin;
	
	@FindBy (xpath="//*[@id='linkglobalSettings']")
	public static WebElement frmhstry;
	
	@FindBy (xpath="//ul[@id='ulglobalSettings']/li/a[contains(text(),'Form 7004')]")
	public static WebElement form7004;
	
	@FindBy (xpath="//*[contains(text(),'Create Business Tax Extension')]")
	public static WebElement createButton;
	
	@FindBy (id="BusinessName")
	public static WebElement bsnsNm;
	
	@FindBy (id="EIN")
	public static WebElement EIN;
	
	@FindBy (id="ConfirmEIN")
	public static WebElement cnfEIN;
	
	@FindBy (id="Address1")
	public static WebElement address1;
	
	@FindBy (id="Address2")
	public static WebElement address2;
	
	@FindBy (id="City")
	public static WebElement city;
	
	@FindBy (id="USStates")
	public static WebElement state;
	
	@FindBy (id="txtzip")
	public static WebElement zip;
	
	@FindBy (id="Phone")
	public static WebElement phone;
	
	@FindBy (id="SAName")
	public static WebElement busName;
	
	@FindBy (id="SATitle")
	public static WebElement busTitle;
	
	@FindBy (id="SADayTimePhone")
	public static WebElement busPhone;
	
	@FindBy (id="btnNext")
	public static WebElement nextButton;
	
	@FindBy (xpath="//i[@title='Log Off']")
	public static WebElement logOff;
	
	@FindBy (name="Submit")
	public static WebElement logOffButton;
}

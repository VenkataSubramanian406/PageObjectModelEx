package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.PageObjects;

public class PageObjectsTC {
	WebDriver driver;
	String username = "barnettcandy20@gmail.com";
	String password = "Admin@123";
	
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	@BeforeTest
	public void implicitWait() {		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 0)
	public void loginPage() {
		PageFactory.initElements(driver, PageObjects.class);
		driver.get("https://ees.efile4taxes.com/");
		PageObjects.LoginName.sendKeys(username); //loginname directly found by id in Pageobjects.java without using @findby
		PageObjects.password.sendKeys(password);
		PageObjects.signin.click();
		
	}
	@Test(priority = 1, dependsOnMethods = "loginPage")
	public void dashboard() {
		PageFactory.initElements(driver, PageObjects.class);
		PageObjects.frmhstry.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(PageObjects.form7004)).click();
//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		wait1.until(ExpectedConditions.elementToBeClickable(
				PageObjects.createButton.click();
	}
	@Test(priority = 2, dependsOnMethods = "dashboard")
	public void enterDetails() {
		PageFactory.initElements(driver, PageObjects.class);
		PageObjects.bsnsNm.sendKeys("MJ");
		PageObjects.EIN.sendKeys("123455432");
		PageObjects.cnfEIN.sendKeys("123455432");
		PageObjects.address1.sendKeys("1st door");
		PageObjects.address2.sendKeys("2nd door");
		PageObjects.city.sendKeys("Chennai");
		
		Select dropDown = new Select(PageObjects.state);
		dropDown.selectByVisibleText("Hawaii (HI)");
		
		PageObjects.zip.sendKeys("12340");
		PageObjects.phone.sendKeys("91-1234554321");
		PageObjects.busName.sendKeys("njh");
		PageObjects.busTitle.sendKeys("jjhhjgf");
		PageObjects.busPhone.sendKeys("45-984353434");
		PageObjects.nextButton.click();							
	}
	@AfterTest
	public void logOut() {
		PageFactory.initElements(driver, PageObjects.class);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(PageObjects.logOff)).click();
	    JavascriptExecutor click = (JavascriptExecutor) driver;
	    click.executeScript("arguments[0].click()", PageObjects.logOffButton);
	
	}
}

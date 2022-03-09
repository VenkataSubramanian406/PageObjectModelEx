package testNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AmazonLoginPage;

public class AmazonExample {
    WebDriver driver;
    String loginname ="venkatasubramanian406@gmail.com";
    String password = "apachertr150";
	
    @BeforeSuite
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Desktop\\venkat\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

    @BeforeTest
    public void implicitlyWait() {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	PageFactory.initElements(driver, AmazonLoginPage.class);
    }
    @Test(priority = 0)
    public void loginPage() {
    	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    	AmazonLoginPage.LoginName.sendKeys(loginname);
    	AmazonLoginPage.button.click();
    	AmazonLoginPage.Password.sendKeys(password);
    	AmazonLoginPage.signin.click();
    }
    @Test (priority=1 , dependsOnMethods= "loginPage")
    public void search() {
    	AmazonLoginPage.searchin.sendKeys(("shoes for men")+Keys.ENTER);
    	AmazonLoginPage.delivery.click();
    	AmazonLoginPage.COD.click();
    	
    	String oldWindow=driver.getWindowHandle();
    	AmazonLoginPage.nivia.click();
    	Set<String> handles=driver.getWindowHandles();
    	
    	for(String newWindow : handles) {
    	    driver.switchTo().window(newWindow);
        }
    }
    @Test (priority=2 , dependsOnMethods= "search")
    public void addToCart() {
    	
    	Select select = new Select(AmazonLoginPage.size);
    	select.selectByIndex(3);
    	
    	AmazonLoginPage.buynow.click();
		}
	
	  @Test (priority=3 , dependsOnMethods= "addToCart")
	  public void enterDetails() {     
	  AmazonLoginPage.fullname.sendKeys("venakt");
	  AmazonLoginPage.moblienum.sendKeys("9878987899");
	  AmazonLoginPage.pincode.sendKeys("600099");
	  AmazonLoginPage.address.sendKeys("plot no 1146,13th street");
	  AmazonLoginPage.area.sendKeys("kolathur");
	  AmazonLoginPage.landmark.sendKeys("near muthoot finance");
	  AmazonLoginPage.town.sendKeys("CHENNAI");
	  
	 // Select select1 = new Select(AmazonLoginPage.state);
	 // select1.selectByVisibleText("TAMIL NADU");
	  driver.close();
	  
	  Set<String> handles=driver.getWindowHandles();
	  
	  for (String oldWindow : handles) {
		  driver.switchTo().window(oldWindow);
	  }
	  Actions action = new Actions(driver);
	  action.moveToElement(AmazonLoginPage.logoff).build().perform();
	  
	  AmazonLoginPage.Signout.click();
	  
	 // AmazonLoginPage.logoff.click();
	  
	  	  }
	 
     }


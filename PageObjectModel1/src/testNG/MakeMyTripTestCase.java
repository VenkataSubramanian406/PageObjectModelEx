package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MakeMyTripTestCase {
      WebDriver driver;
	
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
    	//PageFactory.initElements(driver, SpiceJetLocators.class);
    }

    @Test(priority = 0)
    public void loginPage() throws InterruptedException, AWTException {
    	driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|529579610088&s_kwcid=AL!1631!3!529579610088!e!!g!!make%20my%20trip-&ef_id=EAIaIQobChMIjcaC-e6c9gIVF-J3Ch3aeQR4EAAYASAAEgJLePD_BwE:G:s&gclid=EAIaIQobChMIjcaC-e6c9gIVF-J3Ch3aeQR4EAAYASAAEgJLePD_BwE");
    	  
    	WebElement from =	driver.findElement(By.xpath("//span[contains(text(), 'From')]"));
		Actions act = new Actions(driver);
		act.doubleClick(from).build().perform();
		
		from.click();
				
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		from1.sendKeys("MAA");
		
		Thread.sleep(3000);
		
		WebElement chennai = driver.findElement(By.xpath("//*[contains(text(), 'MAA')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(chennai).build().perform();
					
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", chennai);
		
		//*[contains(text(), 'Bengaluru, India')]
		WebElement to = driver.findElement(By.xpath("//input [@type = 'text'][@autocomplete = 'off']"));
		to.click();
		
		to.sendKeys("bengaluru");
		
		Thread.sleep(3000);
		
		WebElement bng = driver.findElement(By.xpath("//*[contains(text(), 'Bengaluru, India')]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(bng).build().perform();
		bng.click();
    	
			
    	WebElement fromDate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]"));
    	fromDate.click();
    	
    	WebElement pickDate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[2]"));
    	Actions act3 = new Actions(driver);
		act3.moveToElement(pickDate).build().perform();
    	pickDate.click();
    	
    	WebElement toDate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div/label/p"));
    	toDate.click();
    	
    	WebElement pickTo=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[5]"));
    	Actions act4 = new Actions(driver);
		act4.moveToElement(pickTo).build().perform();
    	pickTo.click();
    	
    	WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
    	searchBox.click();
    	
    	WebElement mrngDep=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/label[2]/div"));
    	mrngDep.click();
    	
    	WebElement vistara=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div[5]/div/div/div/label[5]/div/span[2]"));
    	vistara.click();
    	
    	WebElement book=driver.findElement(By.xpath("//*[@id=\"listing-id\"]/div/div[3]/div[1]/div[3]/div/div[2]"));
    	book.click();
    	
    	Thread.sleep(3000);
    	
    	WebElement cont=driver.findElement(By.xpath("//button[contains (text(), 'Continue')]"));
    	cont.click();
    	
    	//String oldWindow=driver.getWindowHandle();
    //	WebElement yesButton=driver.findElement(By.xpath("//*[@id=\"Mobile No\"]/div/input"));
    	//yesButton.sendKeys("9879879879");
    	
    	Set<String> handles=driver.getWindowHandles();
    	Thread.sleep(3000);
    	
    	for (String newWindow : handles) {
			
		   	driver.switchTo().window(newWindow);
    	}
    	   	
    	JavascriptExecutor scroll = (JavascriptExecutor)driver;
    	scroll.executeScript("window.scroll(0,document.body.scrollHeight)");
    	
    	WebElement yesButton=driver.findElement(By.xpath("//*[@id=\"Mobile No\"]/div/input"));
    	yesButton.sendKeys("9879879879");
    	
		/*
		 * WebElement
		 * emailbox=driver.findElement(By.xpath("//*[@id=\"Email\"]/div/input"));
		 * emailbox.sendKeys("venkatasubramanian406@gmail.com"); Actions action2=new
		 * Actions(driver); action2.moveToElement(emailbox).build().perform();
		 */
    	
    	WebElement add=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[3]/button"));
    	add.click();
    	
    	WebElement add1=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/input"));
    	add1.sendKeys("venkat");
    	
    	WebElement add2=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/input"));
    	add2.sendKeys("sub");
    	
    	WebElement add3=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/div/div/label[1]"));
    	add3.click();
    	
    	WebElement add4=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/input"));
    	add4.sendKeys("1");
    	
    	WebElement add5=driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]"));
    	add5.sendKeys("Vistara");
    	
    	WebElement no=driver.findElement(By.xpath("//*[@id=\"INSURANCE\"]/div/div[4]/div[2]/label/span[1]"));
    	no.click();
    	//Actions action2=new Actions(driver); 
    	//action2.moveToElement(add5).build().perform();
    	
    	//*[@id="wrapper_ADULT"]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

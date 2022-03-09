import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\arkam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement button=driver.findElement(By.className(""));
		button.click();
		
		driver.switchTo().frame(0);
		
		WebElement emailBox=driver.findElement(By.className(""));
		emailBox.sendKeys("test@.com");
		
		WebElement appendBox=driver.findElement(By.className(""));
		appendBox.sendKeys("text");
		
		WebElement defaultText=driver.findElement(By.className(""));
		String Value=defaultText.getAttribute("Value");
		System.out.println(Value);
		
		WebElement homePage=driver.findElement(By.className(""));
		homePage.click();
		
		WebElement position=driver.findElement(By.className(""));
		

	}

}

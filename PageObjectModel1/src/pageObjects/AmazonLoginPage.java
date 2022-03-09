package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPage {
	
	@FindBy (id="ap_email")
	public static WebElement LoginName;
	
	@FindBy (id="continue")
	public static WebElement button;
	
	@FindBy (id="ap_password")
	public static WebElement Password;
	
	@FindBy (id="signInSubmit")
	public static WebElement signin;
	
	@FindBy (id="twotabsearchtextbox")
	public static WebElement searchin;
	
	@FindBy (xpath="//*[@id=\"p_90/6741117031\"]/span/a/div/label/i")
	public static WebElement delivery;

	@FindBy (xpath="//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")
	public static WebElement COD;

	@FindBy (xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[20]/div/div/div/div/div[1]/div/span/a/div")
	public static WebElement nivia;

	@FindBy (name="dropdown_selected_size_name")
	public static WebElement size;
	
	@FindBy (xpath="//*[@id=\"a-autoid-38-announce\"]")
	public static WebElement quantity;
	
	@FindBy (id="buy-now-button")
	public static WebElement buynow;
	
	@FindBy (id="ap_password")
	public static WebElement Password1;
	
	@FindBy (id="signInSubmit")
	public static WebElement signin1;
	
	@FindBy (id="address-ui-widgets-enterAddressFullName")
	public static WebElement fullname;
	
	@FindBy (id="address-ui-widgets-enterAddressPhoneNumber")
	public static WebElement moblienum;
	
	@FindBy (id="address-ui-widgets-enterAddressPostalCode")
	public static WebElement pincode;
	
	@FindBy (id="address-ui-widgets-enterAddressLine1")
	public static WebElement address;
	
	@FindBy (id="address-ui-widgets-enterAddressLine2")
	public static WebElement area;
	
	@FindBy (id="address-ui-widgets-landmark")
	public static WebElement landmark;
	
	@FindBy (id="address-ui-widgets-enterAddressCity")
	public static WebElement town;
	
	@FindBy (id="nav-link-accountList")
	public static WebElement logoff;
	
	@FindBy (xpath="//span[contains(text(),'Sign Out')]")
	public static WebElement Signout;
	
}

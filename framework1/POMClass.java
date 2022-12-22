package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	// Declaration
		@FindBy(xpath="//input[@id='email']") private WebElement userID;	
		@FindBy(xpath="//input[@id='pass']") private WebElement pass;	
		@FindBy(xpath="//button[@name='login']") private WebElement loginBtn;
		
		POMClass(WebDriver driver)	{
			PageFactory.initElements(driver, this);			
		}
		
		public void enterPassword(String pwd) {
			pass.sendKeys(pwd);
		}
		public void enterUserId(String id) {
			userID.sendKeys(id);
		}	
		public void clickLoginBtn() {
			loginBtn.click();
		}
}

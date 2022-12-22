package framework1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Pathset;

public class TestClass {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException{			
		System.setProperty("webdriver.chrome.driver",Pathset.Chromepath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");	
	driver.manage().window().maximize();	
		POMClass d = new POMClass(driver);
	// TC01
	d.enterUserId(Utility.readExcelData(2, 0));
	d.enterPassword(Utility.readExcelData(2, 1));
	Utility.takeScreenShot(driver);
	d.clickLoginBtn();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	
           //TC02
	d.enterUserId(Utility.readExcelData(3, 0));
	d.enterPassword(Utility.readExcelData(3, 1));
	Utility.takeScreenShot(driver);
	d.clickLoginBtn();
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	
	//TC03
	Thread.sleep(2000);
	driver.navigate().refresh();
	d.enterUserId(Utility.readExcelData(4, 0));
	d.enterPassword(Utility.readExcelData(4, 1));
	Utility.takeScreenShot(driver);
	d.clickLoginBtn();
}

}

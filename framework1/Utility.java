package framework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String readExcelData(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\SONY\\Downloads\\testing notes\\xel data\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sht = WorkbookFactory.create(f1).getSheet("Sheet1");
		
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;
}
	public static void takeScreenShot(WebDriver driver) throws IOException {
		// To get system current date
		Date d = new Date();		
		String str = d.toString().replace(":", "_");
		
		// To take screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
				
		File dest = new File("C:\\Users\\SONY\\Downloads\\testing notes\\screenshot/image1"+str+".jpg");
		
		FileHandler.copy(src, dest);
	}
	
	

}

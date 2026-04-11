package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base {
	
	@Test 
	public void FileUploadUsingSendKeys() {
		
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement choosFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		choosFile.sendKeys("C:\\Users\\s.ismail\\Downloads\\collectionpdf.pdf"); //Choosing the file copy as path & add double Slash
		
		WebElement Upload=driver.findElement(By.xpath("//input[@id='file-submit']")); //file Uploading
		Upload.click();
		
	}
	@Test
	public void FileUploadUsingRobotClass() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement PDFSelect=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		PDFSelect.click();
		
		StringSelection stringselection = new StringSelection("C:\\Users\\s.ismail\\Downloads\\Assignment_Arraypdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null); //ToolKit Class
		Robot obj=new Robot();
		obj.delay(2000);
		obj.keyPress(KeyEvent.VK_CONTROL); // VK-Virtual Key
		obj.keyPress(KeyEvent.VK_V);		//Pressing the V Key
		obj.keyRelease(KeyEvent.VK_CONTROL); //releasing the CONTROL key
		obj.keyRelease(KeyEvent.VK_V);		
		obj.keyPress(KeyEvent.VK_ENTER);    //pressing the ENTER Key
		obj.keyRelease(KeyEvent.VK_ENTER);	
	}
}

package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadSample extends Base {
	@Test(priority=1)
	public void fileSendKeys() {
		driver.navigate().to("https://wetransfer.com/");
		WebElement addFile=driver.findElement(By.xpath("//span[@class='UploaderButtonsEmptyState_uploaderButtonTextDark__BMIaH']"));
		
		addFile.sendKeys("C:\\Users\\s.ismail\\Downloads\\Assignment_looppdf.pdf\\");
		addFile.click();
	}
	@Test(priority=2) 
	public void filerobot() throws AWTException {
		driver.navigate().to("https://wetransfer.com/");
		WebElement addFile=driver.findElement(By.xpath("//span[@class='UploaderButtonsEmptyState_uploaderButtonTextDark__BMIaH']"));
		addFile.click();
		
		StringSelection obj=new StringSelection("C:\\Users\\s.ismail\\Downloads\\Assignment_looppdf.pdf\\");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
		Robot obj1=new Robot();
		obj1.delay(2000);
		obj1.keyPress(KeyEvent.VK_CONTROL);
		obj1.keyPress(KeyEvent.VK_V);
		obj1.keyRelease(KeyEvent.VK_CONTROL);
		obj1.keyRelease(KeyEvent.VK_V);
		obj1.keyPress(KeyEvent.VK_ENTER);
		obj1.keyRelease(KeyEvent.VK_ENTER);
	}

}

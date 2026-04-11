package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecute extends Base {
	
	@Test
	public void javaScriptExe() {
		
		//Interface in selenium that allows you to executes JAVA script codes directly inside the browser from the selenium test script
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement input=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		js.executeScript("arguments[0].value='Welcome';", input);
		
		WebElement btn=driver.findElement(By.xpath("//button[text()='Show Message']"));
		js.executeScript("arguments[0].value='Welcome';", btn);
	}
	public void Scroll() {
		
		driver.navigate().to("https://webdriveruniversity.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)",""); //x axis=0, y axis=150 (up page to down page)
		js.executeScript("window.scrollBy(0,-150)",""); 
	}
}

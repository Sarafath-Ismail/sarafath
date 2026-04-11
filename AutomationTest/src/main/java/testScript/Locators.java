package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base 
{
	void id() {
		
	  //WebElement elementName=driver.findElmenet(by.locator("locator Value"));
		WebElement message=driver.findElement(By.id("single-input-field")); // By is Class in Selenium
		message.sendKeys("Hello");
		
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
		
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("D"); //Passing the value using SendKeys method
		
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("E"); //Passing the value using SendKeys method
		
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		
		WebElement checkBox=driver.findElement(By.id("check-box-one"));
		checkBox.click();
		
		WebElement checkBox1=driver.findElement(By.id("check-box-two"));
		checkBox1.click();
	}
	void name() {
		
		WebElement date=driver.findElement(By.name("daterange"));
		date.click();
		
		WebElement gender=driver.findElement(By.name("student-gender"));
		WebElement age=driver.findElement(By.name("student-age"));
				
	}
	void className() {
		
		WebElement form=driver.findElement(By.className("form-control"));
		WebElement button=driver.findElement(By.className("btn btn-primary"));
	}
	void linkText() {
		WebElement simple=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkBox=driver.findElement(By.linkText("Checkbox Demo"));
	}
	void partialLinkText() {
		
		WebElement select=driver.findElement(By.partialLinkText("Select Input"));
		WebElement form=driver.findElement(By.partialLinkText("Form Submit"));
	}
	
	public static void main(String[] args) 
	{
		Locators obj=new Locators();
		obj.browserInstallation();
		obj.id();
		obj.name();
		obj.className();
		obj.linkText();
		obj.partialLinkText();
	}

}

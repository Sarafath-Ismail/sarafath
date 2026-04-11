package testScript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class MultipleWindowHandling extends Base
{
	public void multipleWindows() {
		driver.navigate().to("https://www.webdriveruniversity.com/");
		WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		String parent=driver.getWindowHandle(); //calling getWindowHabdle(); & assigning to String variable Parent.
		System.out.println(parent);  //printing parent
		System.out.println("*************************************************************");
		
		Set<String> allWindows=driver.getWindowHandles();
		for(String wind : allWindows) {  					//iterating
			System.out.println("Windlow handle" +wind);		
			driver.switchTo().window(wind);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************************************");
		}
	}
	public static void main(String[] args) {
		
		MultipleWindowHandling obj=new MultipleWindowHandling();
		obj.browserInstallation();
		obj.multipleWindows();

	}

}

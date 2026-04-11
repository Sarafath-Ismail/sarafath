package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;
	//@BeforeMethod
	public void browserInitialization() {
		
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
	}
	//@AfterMethod
	public void browserQuitAndClose() 
	{
		driver.quit();
	}

}

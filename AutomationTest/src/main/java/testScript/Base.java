package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Base{
	
	public WebDriver driver; //Global variable declaration as driver
	protected void browserInstallation() 
	{
		driver=new ChromeDriver();  //browser initialization
		driver.get("https://selenium.qabible.in/");  //URL launching (get method)
		driver.manage().window().maximize(); // to maximize the screen
	}	
	void browserQuitClose() //separate method created for Quit & close
	{
		driver.quit(); //to close the particular window
		//driver.close(); //to close all the opened windows
	}

	public static void main(String[] args) 
	{
		
		Base obj= new Base();
		obj.browserInstallation();

	}

}

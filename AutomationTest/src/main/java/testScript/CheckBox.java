package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void checkBox1() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickOn=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickOn.click();
	}
	public void selectionCheck() 
	{
		WebElement clickOn=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickOn.click();
		if(clickOn.isSelected())
		{
			System.out.println("Check Box selected");
		}
		else
		{
			clickOn.click();
		}
	}
	public static void main(String[] args) 
	{
		CheckBox obj=new CheckBox();
		obj.browserInstallation();
		obj.checkBox1();
		obj.selectionCheck();
	}

}

package testScript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class AlertHandling extends Base {
	
	public void SimpleAlert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		
		Alert obj=driver.switchTo().alert(); //creating the object to switchto Alert
		obj.accept(); //Accepting the or clicking OK
	}
	public void ConfirmationAlert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		
		Alert obj=driver.switchTo().alert(); //creating the object to switchto Alert
		obj.dismiss(); // Canceling the Alert
	}
	public void PromptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		prompt.click();		
		Alert obj=driver.switchTo().alert();
		obj.sendKeys("This is prompt Alert");
		obj.accept();
	}

	public static void main(String[] args) {
		
		AlertHandling obj=new AlertHandling();
		obj.browserInstallation();
		obj.SimpleAlert();
		obj.ConfirmationAlert();
		obj.PromptAlert();
	}

}

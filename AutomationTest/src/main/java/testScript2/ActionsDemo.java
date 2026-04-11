package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testScript.Base;

public class ActionsDemo extends Base {
	
	public void dragandDrop() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//div[@id='todrag']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions ac=new Actions(driver); //creating the object for Actions
		ac.dragAndDrop(drag1, drop).perform(); //calling perform() to execute
	}
	public void rightClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement rightobj=driver.findElement(By.xpath("//div[@id='todrag']"));
		Actions obj=new Actions(driver);
		obj.contextClick(rightobj).perform(); //calling contextClick() to click on specific target (rightobj)
	}
	public void mouseOver() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mouse=driver.findElement(By.xpath("//div[@id='todrag']"));
		Actions obj=new Actions(driver);
		obj.moveToElement(mouse).perform(); //calling moveToElement(mouse) to mouse over on the object
	}
	public void singleClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement cick=driver.findElement(By.xpath("//div[@id='todrag']"));
		Actions obj=new Actions(driver);
		obj.click(cick).perform(); //calling Click() method to perform the click action
	}
	public void DoubleClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement doublcick=driver.findElement(By.xpath("//div[@id='todrag']"));
		Actions obj=new Actions(driver);
		obj.doubleClick(doublcick).perform(); //calling doubleClick() method to perform the double click action
	}

	public static void main(String[] args) {
		
		ActionsDemo obj=new ActionsDemo();
		obj.browserInstallation();
		obj.dragandDrop();
		obj.rightClick();
		obj.mouseOver();
		obj.singleClick();
		obj.DoubleClick();
	}
}

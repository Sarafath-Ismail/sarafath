package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testScript.Base;

public class DropDownHandling extends Base {
	
	public void byValue() {
		
		driver.navigate().to("https://selenium.qabible.in/select-input.php"); //to navigate to the Page
		WebElement color=driver.findElement(By.xpath("//Select[@id='single-input-field']")); //locate the Web Element
		Select obj=new Select(color); //creating the object for Drop down
		obj.selectByValue("Green"); //calling the value from the drop down
	}
	public void byIndex() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php"); //to navigate to the Page
		WebElement color=driver.findElement(By.xpath("//Select[@id='single-input-field']")); //locate the Web Element
		Select obj=new Select(color); //creating the object for Drop down
		obj.selectByIndex(3); //calling value by index number from drop down
	}
	public void byVisibleText() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php"); //to navigate to the Page
		WebElement color=driver.findElement(By.xpath("//Select[@id='single-input-field']")); //locate the Web Element
		Select obj=new Select(color); //creating the object for Drop down
		obj.selectByVisibleText("Yellow"); //calling the value by visible text from drop down
				
	}
	
	//select.getOptions() // to get all the values from the drop down
	
	public static void main(String[] args) {
		
		DropDownHandling obj=new DropDownHandling();
		obj.browserInstallation();
		obj.byValue();
		obj.byIndex();
		obj.byVisibleText();

	}

}

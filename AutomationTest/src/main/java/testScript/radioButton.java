package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class radioButton extends Base {
	
	public void radioButton1() {
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement male=driver.findElement(By.xpath("//input [@id='inlineRadio1']"));
		male.click();
		
		WebElement female=driver.findElement(By.xpath("//input [@id='inlineRadio2']"));
		female.click();
			
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
	}
	public void selection() {
		WebElement male=driver.findElement(By.xpath("//input [@id='inlineRadio1']"));
		if(male.isSelected())
		{
			System.out.println("Male buttion Selected");
		}
		else {
			male.click();
		}
			
	}
	public void mulitpleRadioButton() {
	List<WebElement> radios = driver.findElements(By.name("gender"));

	for(WebElement r : radios){
	    if(r.getAttribute("value").equals("Female")){
	        r.click(); 
	     }
	    }
	}	
	public static void main(String[] args) {

		radioButton obj=new radioButton();
		obj.browserInstallation();
		//obj.radioButton1();
		obj.selection();
		
	}

}

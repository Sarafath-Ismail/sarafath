package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSelector extends Base 
{
	//Tag and Id (tag # id)
	//Tag and Class (tag.class)
	//Tag and Attribute (tag[attribute=value]
	//Tag, class and Attribute (tag.class[attribute=value]
	
	void tagandId() {
		//Tag and Id (tag # id)
		WebElement input=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement value=driver.findElement(By.cssSelector("input#value-a"));
	}
	void tagandClass() {
		//Tag and Class (tag.class)
		WebElement picker=driver.findElement(By.cssSelector("input.form-control.datepicker"));
		WebElement form=driver.findElement(By.cssSelector("input.form-control"));
	}
	void tagandAttribute() {
		//Tag and Attribute (tag[attribute=value]
		WebElement single=driver.findElement(By.cssSelector("input[id='single-input-field2']"));
		WebElement jquery=driver.findElement(By.cssSelector("input[id='from']"));
		
	}
	void tagClassAttribute() {
		//Tag, class and Attribute (tag.class[attribute=value]
		WebElement button=driver.findElement(By.cssSelector("button.btn-primary[class='btn btn-primary']"));
		WebElement datepicket=driver.findElement(By.cssSelector("input.form-control[class='form-control datepicker']"));
		WebElement dateRange=driver.findElement(By.cssSelector("input.form-control[id='from']"));
	}
	public static void main(String[] args) 
	{
		CSSelector obj=new CSSelector();
		obj.browserInstallation();
		obj.tagandId();
		obj.tagandClass();
		obj.tagandAttribute();
		obj.tagClassAttribute();
	}

}

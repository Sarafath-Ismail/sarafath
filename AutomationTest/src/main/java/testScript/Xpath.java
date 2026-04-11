package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	
	/* Absolute Xpath
	 * 1.start from the route node (HTML)
	 * 2.shows the complete path from the beginning to the element
	 * 3.begings with single slash
	 * Eg:/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button 
	 * 
	 * Disadvantage: very long path
	 * breaks easily if page structure changes
	 * 
	 * Relative Xpath
	 * 1.start from the anywhere in the Dom
	 * 2.begins with double slash (//)
	 * 3.more flexible and commonly used in the selenium
	 * 
	 * Advantage: short, stable, mostly used in the Automation
	 * */ 
	//Relative Xpath
	public void relativeXpath() {
		
		//tagname[@attribute='value']
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement vlaueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement vlaueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement total=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	}
	public void text() {
	//tagname[text()='value'] -will take only text
		
		WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement total=driver.findElement(By.xpath("//button[text()='Get Total']"));
	}
	public void contains() {
		//tagname[contains(@attribute,'value')]
		//tagname[contains(text(),'value')]
		WebElement showMessage=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement yourmessage=driver.findElement(By.xpath("//div[contains(text(), 'Your Message')]"));
	}
	public void startwith() {
		//tagname [starts-with(@attribute,'value')]
		//tagname [Starts-with(text(),'value')]
		WebElement Message=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
		WebElement showMessage=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement showMessage1=driver.findElement(By.xpath("//button[starts-with(text(),'Show Me')]"));
		
	}
	public static void main(String[] args) {
		Xpath obj=new Xpath();
		obj.browserInstallation();
		obj.relativeXpath();
		obj.text();
		obj.contains();
	}

}

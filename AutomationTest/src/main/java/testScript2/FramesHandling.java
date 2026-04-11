package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class FramesHandling extends Base {
	
	public void frames() {
		
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame); //calling switch.frame method in frame to switch
		WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
	}
	public static void main(String[] args) {
		
		FramesHandling obj=new FramesHandling();
		obj.browserInstallation();
		obj.frames();

	}

}

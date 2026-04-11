package testScript;

import org.testng.annotations.Test;

public class SampleClass extends Base 
{
	@Test(priority=1)		//Test annotation
	public void Show() {
	
		System.out.println("Hello");
		
	}
	@Test(priority=2)
	public void Display() {
		
		System.out.println("Hi");
	}
}

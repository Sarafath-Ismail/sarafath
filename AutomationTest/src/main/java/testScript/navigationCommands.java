package testScript;

public class navigationCommands extends Base {
	
	void navigation() 
	{
		driver.navigate().to("https://www.flipkart.com/"); //to jump into the different webpage
		driver.navigate().back(); //to go back to pages which previously opened
		driver.navigate().forward(); //to go forward pages
		driver.navigate().refresh(); //to refresh the page
		
	}

	public static void main(String[] args) {
		
		navigationCommands obj=new navigationCommands();
		obj.browserInstallation(); //always call this method to automate
		obj.navigation();
		//obj.browserQuitClose();
		
		
	}

}

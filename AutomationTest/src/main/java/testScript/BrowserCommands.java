package testScript;

public class BrowserCommands extends Base {
	
	void browserCommandsMethods() 
	{
		String s=driver.getTitle(); //to get current page title
		System.out.println(s);
		
		String url=driver.getCurrentUrl(); //to get the current page URL
		System.out.println(url);
		
		String pagesource=driver.getPageSource(); //to get current page source HTML code
		System.out.println(pagesource);
		
	}

	public static void main(String[] args) 
	{
		BrowserCommands obj=new BrowserCommands();
		obj.browserInstallation();
		obj.browserCommandsMethods();
		obj.browserQuitClose();
	}

}

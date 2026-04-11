package testScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class TableHandling extends Base {
	
	public void tableprint() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]")); // //tbody//tr[4] to locate the table body & row & index position
		System.out.println(row.getText()); //printing the row in getText() 
		
	}
	public void cellPriting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[2]")); // //tbody//tr[4] to locate the table body & row & & cell index position
		System.out.println(cell.getText());
		
	}
	public void columnPriting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]")); // //
		
		for(WebElement col : column)
			System.out.println(col.getText());
		
	}
	public static void main(String[] args) {
		
		TableHandling obj=new TableHandling();
		obj.browserInstallation();
		obj.tableprint();
		obj.rowPrinting();
		obj.cellPriting();
		obj.columnPriting();
	}


}

package excelSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParent {
	
	static FileInputStream f; 
	//inbuilt class in java, to read the file
	static XSSFWorkbook wb; 
	//Apache inbuilt class, to read the details from Workbook
	static XSSFSheet sh; 
	//to read the details from the sheet
	
	public static String getStringData(int a, int b) throws IOException{
		f=new FileInputStream("C:\\Users\\s.ismail\\Downloads\\Sample JavaProg.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");// Its a method to get the data from the sheet
		XSSFRow r=sh.getRow(a); //inbuilt class in apache, to read the data from sheet
		XSSFCell c=r.getCell(b);// read details from the cell
		return c.getStringCellValue(); //to get the string value from the cell
	}
	public static String getIntegerData(int a, int b) throws IOException {
		f=new FileInputStream("C:\\Users\\s.ismail\\Downloads\\Sample JavaProg.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int)c.getNumericCellValue(); //x=Type cast, //to get the double value from the cell
		return String.valueOf(x); //Type conversion, to convert the int value into String
	}
	public static String getFloatData(int a, int b) throws IOException {
		f=new FileInputStream("C:\\Users\\s.ismail\\Downloads\\Sample JavaProg.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		float x=(float)c.getNumericCellValue(); //x=Type cast, //to get the double value from the cell
		return String.valueOf(x); //Type conversion, to convert the int value into String
	}
	
	

}

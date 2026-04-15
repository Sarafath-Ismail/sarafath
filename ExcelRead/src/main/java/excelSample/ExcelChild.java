package excelSample;

import java.io.IOException;

public class ExcelChild {

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelParent.getStringData(1, 0));
		System.out.println(ExcelParent.getStringData(2, 0));
		System.out.println(ExcelParent.getIntegerData(1, 1));
		System.out.println(ExcelParent.getFloatData(3, 1));

	}

}

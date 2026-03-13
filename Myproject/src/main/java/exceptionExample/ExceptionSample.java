package exceptionExample;

public class ExceptionSample {

	public static void main(String[] args) {
		
		try {
		int a=4;
		int c=a/0;  
		System.out.println("Output is"+c); 
		}
		catch(ArithmeticException ab)
		{
		System.out.println("Exception handled");
	} 
		finally {
			System.out.println("Program executed");
		}
			System.out.println("Outside code");
//Exception in thread "main" java.lang.ArithmeticException: / by zero 
		
		try {
		String ar1[] = {"Blue", "Red", "Yellow"};
		System.out.println(ar1[3]);
		}
		catch(Exception a)
		{
			System.out.println("Exception Handled array out of bound");
		}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 */

/*	String a=null;
	System.out.println(a.length());

// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "a" is null
*/
		
	}
}



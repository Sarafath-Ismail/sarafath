package finalKeyword;

public class Finalvariable {

	public static void main(String[] args) {
		
		final int a=10; //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		                //The final local variable a cannot be assigned. It must be blank and not using 
						//a compound assignment
		//a=3;
		
		int b=3;
		b=5;
	}
	public final void addition()
	{
		int a=3; int b=5;
		int c=a+b;
		System.out.println(c);
	}
	
}

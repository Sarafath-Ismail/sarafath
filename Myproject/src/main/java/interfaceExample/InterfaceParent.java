package interfaceExample;

public interface InterfaceParent {
	
	public static final int a=6; int b=8;
	
	public abstract void sum();
	
	public static void Div()  //using Static method
	{
		System.out.println("This is Static method"); 
	}
	
	default void Multiplication() {   //using default method
		//a=7;  The final field InterfaceParent.a cannot be assigned
		
		System.out.println("This is Default method");
	}
	
}

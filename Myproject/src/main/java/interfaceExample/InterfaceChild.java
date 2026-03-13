package interfaceExample;

public class InterfaceChild implements InterfaceParent 
{
	
	@Override
	public void sum() 
	{
		int a=5;
		int b=7;
		int c=a+b;
		System.out.println(c);
	
	}
	public static void main(String[] args)
	{
		InterfaceParent obj=new InterfaceChild();
		obj.sum();
		InterfaceParent.Div(); //object calling Static method
		obj.Multiplication(); //object calling default method
		System.out.println(a+b);
	}
}

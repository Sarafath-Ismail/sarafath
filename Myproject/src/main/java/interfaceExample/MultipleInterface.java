package interfaceExample;

public class MultipleInterface implements InterfaceParent1, InterfaceParent2 
{

	public static void main(String[] args)
	{
		MultipleInterface obj=new MultipleInterface();
		obj.sum();
		obj.Div();
		obj.display();
		
	}

	@Override
	public void Div() {
	 
		int a=3;
		int b=4;
		int c=a/b;
		System.out.println(c);
	}

	@Override
	public void sum() {
		
		int a=5;
		int b=7;
		int c=a+b;
		System.out.println(c);
	}
	@Override
	public void display() {
		System.out.println("This is Parent1 Method"); 
		System.out.println("This is Parent2 Method");
	}
}
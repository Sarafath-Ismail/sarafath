package abstraction;

public abstract class AbstractParent 
{
	public AbstractParent (int a, int b) 
	{
		System.out.println(a+b);
	}
	public AbstractParent()
	{
		System.out.println("Its non Parameterized Constructor");
	}
public abstract void display();


public abstract int Sum(int a, int b); //parameterized abstract method constructor in Parent class

public void Div() {
	
	int a=4;
	int b=2;
	int c = a/b;
	System.out.println("Division is:" +c);
}
}


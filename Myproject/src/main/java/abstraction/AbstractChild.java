package abstraction;

public class AbstractChild extends AbstractParent 
{
public static void main(String[] args) {
	
	AbstractParent obj=new AbstractChild(); //Abstract class cannot create object, so reference created
	obj.display();
	AbstractParent obj1=new AbstractChild(); 
	System.out.println("Sum is:"+obj1.Sum(2,5));
	AbstractParent obj2=new AbstractChild();
	obj2.Div();
	
	AbstractChild obj3=new AbstractChild(); //Child class object created
	obj3.Display1();
	obj.display();
	System.out.println("Sum is:" +obj1.Sum(3, 8));
	obj2.Div();
	
	}
public AbstractChild() {
	super(3,5);
	System.out.println("its a non-parameteraized Contructor");
}
@Override
public void display() 
{
	int a=3;
	int b=7;
	int c=a+b;
	System.out.println(c);
}
@Override
public int Sum(int a, int b) {
	
	int c=a+b;
	return c;
}
public void Display1() {
	System.out.println("Hello");
}

}

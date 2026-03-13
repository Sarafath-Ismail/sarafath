package iheritance;

public class Child extends Intermidiatechild {
	
	public void Multiplication()
	{
		int a=4;
		int b=3;
		int c=a*b;
		System.out.println("Multiplication is :" +c);
		
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.Multiplication();
		obj.sum();
		obj.div();
		
		
		

	}

}

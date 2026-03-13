package superkey;

public class Supermethodchild extends Supermethodparent {

	public void sum(int a, int b)
	{
	
		int c=a+b;
		System.out.println(c);
		super.display();  //calling parent class 1st method
		
	}
	public void div(int a, int b)
	{
				int c=a/b;
		System.out.println(c);
		super.show();  //calling parent class 2nd method
	}
	public static void main(String[] args) 
	{
	Supermethodchild obj=new Supermethodchild();
	obj.div(5,8);
	obj.sum(6,9);

	}

}

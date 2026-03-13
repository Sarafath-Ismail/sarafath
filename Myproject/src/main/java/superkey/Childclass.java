package superkey;

public class Childclass extends Parentclass {
	
	String color="Blue";
	
	public void display()
	{
		System.out.println(super.clolor);
	}

	public static void main(String[] args) {
		
		Childclass obj=new Childclass();
		System.out.println(obj.color);
		obj.display();
	}

}

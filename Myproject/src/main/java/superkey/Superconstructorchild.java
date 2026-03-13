package superkey;

public class Superconstructorchild extends Superconstructorparent {
	
	public Superconstructorchild() {
		
		this(5);
		System.out.println("Super Key Using Constructor");
		
	}
	public Superconstructorchild(int a) {
		
		super(3,7);
		System.out.println(a);
					
	}
		
	public static void main(String[] args) 
	{
		Superconstructorchild obj=new Superconstructorchild();
		//Superconstructorparent obj1=new Superconstructorparent(); // not printing bcz non parameter will print as default
	}

}

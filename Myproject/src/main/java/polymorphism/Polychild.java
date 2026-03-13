package polymorphism;

public class Polychild extends Polyparent{
	
	void display() {
		System.out.println("Hello, Hi");
		super.display();
		
	}
	void result(int a)
	{
		System.out.println(a);
		super.result(8);
	}
	
	@Override
	void sum(int b) {
		
		super.sum(88);
		System.out.println(b);
	}
	public static void main(String[] args) {

	 Polychild obj=new Polychild();
	 obj.display();
	 obj.result(7);
	 obj.sum(99);
	}

}

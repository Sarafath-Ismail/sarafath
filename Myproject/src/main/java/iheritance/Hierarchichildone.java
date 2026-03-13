package iheritance;

public class Hierarchichildone extends HierarchiParent {

	public void display2()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
	Hierarchichildone obj=new Hierarchichildone();
	obj.display();
	obj.display2();

	}

}

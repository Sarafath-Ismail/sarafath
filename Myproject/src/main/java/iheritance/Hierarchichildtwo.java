package iheritance;

public class Hierarchichildtwo extends HierarchiParent {

	public void display3()
	{
		System.out.println("Hi, this is Hierarchi");
	}
	
	public static void main(String[] args) {
		
	Hierarchichildtwo obj=new Hierarchichildtwo();
	obj.display();
	obj.display3();

	}

}

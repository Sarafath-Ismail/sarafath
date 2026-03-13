package aggregation;

public class Aggregation2 {
	
	String Name;
	int Number;
	Aggregation1 Ref;
	
	public Aggregation2(String Name, int Number, Aggregation1 Ref)
	{
		this.Name=Name;
		this.Number=Number;
		this.Ref=Ref;
	}
	void display()
	{
		System.out.println(Name+" "+Number);
		System.out.println(Ref.Card+" "+Ref.Pin);
		
	}
	public static void main(String[] args) {
		
		Aggregation1 obj1=new Aggregation1("Elzin",10);
		Aggregation2 obj=new Aggregation2("Hyzin", 2, obj1);
		obj.display();
	}

}

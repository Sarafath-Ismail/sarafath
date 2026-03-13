package aggregation;

public class AggregationChild {
	
	String Color;
	int number;
	AggregationParent Ref;
	public AggregationChild(String Color, int number, AggregationParent Ref)
	{
		this.Color=Color;
		this.number=number;
		this.Ref=Ref;
		
	}
	void display()
	{
		System.out.println(Color+" "+number);
		System.out.println(Ref.marks + Ref.name);
		
	}

	public static void main(String[] args) {
		
		AggregationParent obj1=new AggregationParent("Roy", 77);
		AggregationChild obj=new AggregationChild("Blue", 11, obj1);//parent class object to call here obj1.
		obj.display();
		
	}

}

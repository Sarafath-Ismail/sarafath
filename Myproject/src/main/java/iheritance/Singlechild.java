package iheritance;

public class Singlechild extends Singleparent {

	public void name() {

		System.out.println("name");
	}	
	public static void main(String[] args) {

		Singlechild obj=new Singlechild();
		obj.name();
		obj.sum();
		obj.multiplication();
		
	}

}

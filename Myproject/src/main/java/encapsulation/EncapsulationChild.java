package encapsulation;

public class EncapsulationChild {

	public static void main(String[] args) {
		
		EncapsulationParent obj=new EncapsulationParent();
		obj.setMark(35);
		System.out.println(obj.getMark());
		obj.setName("Hyzin");	
		System.out.println(obj.getName());
	}

}

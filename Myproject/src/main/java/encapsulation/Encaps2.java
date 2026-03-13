package encapsulation;

public class Encaps2 {

	public static void main(String[] args) 
	{
		Encaps1 obj=new Encaps1();
		obj.setUsername("Elzin");
		System.out.println("UserName:"+obj.getUsername());
		obj.setPassword(4111);
		System.out.println("Password:" +obj.getPassword());
		
	}

}

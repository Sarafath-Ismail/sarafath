package encapsulation;

public class User {

	public static void main(String[] args) {
		
	Bank b1=new Bank();
	b1.setPin(1101);
		if(b1.validatePin()) 
		{
			System.out.println("Successful");
		}
		else 
		{
			System.out.println("Invalid Pin");
		}
	}

}

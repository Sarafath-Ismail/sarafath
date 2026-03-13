package abstraction;

public class FullTimeEmployee extends Employee {
	
	FullTimeEmployee (int Pay)
	{
		super(Pay);
	}
	int calculateSalary() 
	{
		return PaymentPerHour*8;
	}
	public static void main(String[] args) 
	{
		Contractor obj=new Contractor(700,8);
		FullTimeEmployee obj1=new FullTimeEmployee(900);
			System.out.println("Contractor Credited salary is:"+obj.calculateSalary());
			System.out.println("Full Time salary of Emplyee is:"+obj1.calculateSalary());
		
	}

}

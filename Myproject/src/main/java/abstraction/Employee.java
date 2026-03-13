package abstraction;

public abstract class Employee 
	{
	
	int PaymentPerHour;
	
	Employee (int PaymentPerHour)
	{
		this.PaymentPerHour=PaymentPerHour;
	}

	abstract int calculateSalary();
}
	


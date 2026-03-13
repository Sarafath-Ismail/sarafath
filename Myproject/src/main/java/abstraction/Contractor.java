package abstraction;

public class Contractor extends Employee 
{
	int WorkingHours;
	
	Contractor(int Pay, int Hours){
		super(Pay);
		WorkingHours=Hours;
	}
	@Override
	int calculateSalary() {
		return PaymentPerHour*WorkingHours;
	}
}

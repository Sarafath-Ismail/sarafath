package salaryCalculator;

public class Totalsalary extends HRA {

	double totalsalary;
	
	void total()
	{
		totalsalary = basicPay + hra - pf - deduction + bonus;
		
	}


}

package salaryCalculator;

public class HRA extends Employee {

	double hra;
	double pf;
	
	void calulate()
	{
		hra=basicPay*0.05;
		pf=basicPay*0.20;

	}

}

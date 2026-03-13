package salaryCalculator;

public class Payslip extends Totalsalary {
	
	void display()
	{
        System.out.println("------ Salary Slip ------");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);

        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("Total Salary in Hand: " + totalsalary);
	}
	

	public static void main(String[] args) {

		Payslip obj=new Payslip();
		obj.calulate();
		obj.total();
		obj.display();
	}

}

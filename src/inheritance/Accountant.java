package inheritance;

public class Accountant extends Employee {
	void accountantSalary()
	{
	super.calculateSalary(50000,15000,12000);
		System.out.println("ACCOUNTANT SALARY DETAILS");
		System.out.println("TOTAL SALARY"+total);
		
		super.calculateBonus(50000);
		
		System.out.println("bonus:"+bonus);
		
	}
	}
		
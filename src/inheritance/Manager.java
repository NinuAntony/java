package inheritance;

public class Manager extends Employee {
void managerSalary()
{
super.calculateSalary(100000,20000,20000);
System.out.println("MANAGER SALARY DETAILS");
System.out.println("TOTAL SALARY"+total);
	super.calculateBonus(100000);
	
	System.out.println("bonus:"+bonus);
	
}
}
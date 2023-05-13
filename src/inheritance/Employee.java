package inheritance;


public class Employee {
	
	double bonus;int total;
	
	public int calculateSalary(int basic,int da,int hra)
	{
		total=basic+da+hra;
		
		return total;
		}
	public double calculateBonus(int basic)
	{
		bonus=basic*0.1;
		
		return bonus;
	}
	}




package inheritance;
import java.util.Scanner;

public class SalaryCalculation 
{
	int basic,bonus,deduction;
public int value()
{
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.print("enter basicsalary");
	basic=sc.nextInt();
	System.out.print("enter bonus");
	bonus=sc1.nextInt();
	System.out.print("enter deduction");
	deduction=sc2.nextInt();
	return basic;
	
	}
}


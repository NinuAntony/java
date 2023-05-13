package abstraction;

public class FullTimeEmployee extends Employee {

	@Override
	void calcualteSalary(int totalhours,int rps) {
		int payment=totalhours*rps;
		System.out.println("Fulltimeemployee payment:"+" "+payment);
		
	}

public static void main (String args[])
{

	Contractor c=new Contractor();
	c.calcualteSalary(12, 1000);
	c.print();
	FullTimeEmployee f=new FullTimeEmployee();
	f.calcualteSalary(8,1000);
	}
}
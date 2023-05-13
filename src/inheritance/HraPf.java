package inheritance;

public class HraPf extends SalaryCalculation {
double hra,pf;
	public int value()
	{
	    super.value();
		hra=0.05*basic;
		pf=0.2*basic;
		double totalinhand=basic+hra-pf-deduction+bonus;
		System.out.println("salary in hand:"+totalinhand);
		System.out.println("hra="+hra);
		System.out.println("pf="+pf);
		return 0;
		
		
	}
		
}		
	



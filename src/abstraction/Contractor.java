package abstraction;

public class Contractor extends Employee {

	@Override
	void calcualteSalary(int totalhours, int rps) {
		int payment=totalhours*rps;
		System.out.println("contractor payment:"+" "+payment);
		
	}

}
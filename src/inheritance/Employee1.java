package inheritance;

public class Employee1 extends Member
{
	String speclization="VLSI";
void printSalary()
{
	super.name="ninu";
	super.age=30;
	super.phoneno=894374167;
	super.address="tcr";
	super.salary=30000;	
	System.out.println("employee details" );
	System.out.println("name is"+" "+name);
	System.out.println("age is"+" "+age);
	System.out.println("phoneno is"+" "+phoneno);
	System.out.println("address is"+" "+address);
	System.out.println("salary is"+" "+salary);
}
}



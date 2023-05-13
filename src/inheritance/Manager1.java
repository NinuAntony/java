package inheritance;

public class Manager1 extends Member
{
	String department="ECE";
	void printSalary()
	{
		super.name="abc";
		super.age=25;
		super.phoneno=894374167;
		super.address="ktym";
		super.salary=50000;	
		System.out.println("manager details" );
		System.out.println("name is"+" "+name);
		System.out.println("age is"+" "+age);
		System.out.println("phoneno is"+" "+phoneno);
		System.out.println("address is"+" "+address);
		System.out.println("salary is"+" "+salary);
	}
	

	public static void main(String[] args) {
		Manager1 man=new Manager1();
		man.printSalary();
		Employee1 emp=new Employee1();
		emp.printSalary();

	}

}

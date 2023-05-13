package revision;

public class ConstructorDetailsOfStudent {
	
	ConstructorDetailsOfStudent()
	{
	
	System.out.println("college name");
	}
	public ConstructorDetailsOfStudent(int studentid, String name)
	{
System.out.println( +studentid +" "+name);
	}

	public static void main(String[] args) {
		ConstructorDetailsOfStudent details=new ConstructorDetailsOfStudent();
		ConstructorDetailsOfStudent result1=new ConstructorDetailsOfStudent(1,"ninu");
		ConstructorDetailsOfStudent result2=new ConstructorDetailsOfStudent(2,"jaya");

	}

}

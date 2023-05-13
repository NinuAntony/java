package revision;


public class Student implements Interface1 {

	public void print() {
		System.out.println("name is ninu");

	}
public void print1()
{
	System.out.println("class method");
}
	public static void main(String[] args) {
		Interface1 i=new Student();
		i.print();
		Interface1.display();
		
		Student s=new Student();
		s.print1();
		System.out.println(i.rollno);
}
}
package revision;

public class variable {
int salary=50000;
static String number="kl085544";
public static void staticMethod()
{
System.out.println("THIS IS STATIC METHOD");
}
public void instanceMethod()
{
	System.out.println("This is instance method");
}
	public static void main(String[] args) {
		String name="Ninu";
		System.out.println("student name is:"+name);
		System.out.println(variable.number);
		variable v=new variable();
		System.out.println(v.salary);
	variable.staticMethod();
	variable v1=new variable();
	v1.instanceMethod();
	}

}

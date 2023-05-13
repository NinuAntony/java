package revision;

public class ChildClass extends ParentClass {
	public void display()
	{
		super.display();
		System.out.println("This is child class method");
	}

	public static void main(String[] args) {
		ChildClass ch=new ChildClass();
		ch.display();

	}

}

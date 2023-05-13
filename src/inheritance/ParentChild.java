package inheritance;

public class ParentChild extends Child {

	public static void main(String[] args) {
		Parent parent1=new Parent();
		parent1.method();
		//Child child1=new Child();
		//child1.method();
		Parent p=new Child();
		Child c=(Child)p;
		p.method();
		c.method();
	}

}

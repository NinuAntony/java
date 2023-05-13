package revision;

public class ChildInterface implements Interface1, Interfac2 {

	@Override
	public void display() {
		System.out.println("This is parent2");

	}

	@Override
	public void print() {
		System.out.println("This is parent1");

	}

	public static void main(String[] args) {
		ChildInterface c=new ChildInterface();
		c.display();
		c.print();
		

	}

}

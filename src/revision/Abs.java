package revision;

public class Abs extends AbstractMethod {

	@Override
	public void display() {
		System.out.println("this is abstract method");

	}

	public static void main(String[] args) {
	
Abs ab=new Abs();
ab.print();
ab.display();

	}

}

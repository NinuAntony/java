package interface1;

public class Multiple implements Inter1, Inter2 {

	@Override
	public void sketch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void name() {
		System.out.println("my name is ninu");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("Nothing to display");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		System.out.println("This is multiple inheritance");
		Multiple m=new Multiple();
		m.display();
		m.name();

	}

}

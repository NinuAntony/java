package inheritance;

public class Square1 extends Rectangle1 {
	void print()
	{
		super.print();
		System.out.print("square is rectangle");
	}
	public static void main(String[] args) {
		Shape shape1=new Shape();
		shape1.print();
		Circle cir=new Circle();
		cir.print();
		Square1 sq=new Square1();
		sq.print();
	}

}

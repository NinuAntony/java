package interface1;

public class Rectangle implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		int area=length*breadth;
		System.out.print("AREA OF RECTANGLE="+" "+area);

	}

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.getArea(20,10);

	}

}

package inheritance;

public class Rectangle {
	int length=20;
	int bredth=10;
	int area;
	int perimeter;
	public void recPerimeter()
	{
		perimeter=2*(length+bredth);
		System.out.println("perimeter of rectangle:"+perimeter);
	}
public void recArea()
{
	area=length*bredth;
	System.out.println("area of rectangle:"+area);
}
}

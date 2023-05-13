package inheritance;

public class Square extends Rectangle {
	public void recPerimeter()
	{
		super.recPerimeter();
		super.recArea();
int squperimeter=4*length;
System.out.println("perimeter of square:"+squperimeter);
int squarea=length*length;
System.out.println("area of square:"+squarea);		
	}
	
	public static void main(String[] args) {
		Square square1=new Square();
		square1.recPerimeter();

	}

}

package exception;

public class ArrayBoundException1 {

	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16};
try
{
	int a=arr[7];
	System.out.print(a);
	
}
catch(ArrayIndexOutOfBoundsException a)
{
	a.printStackTrace();
	System.out.println("array is out of bound");
}
	}

}

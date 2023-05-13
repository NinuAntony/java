package revision;

public class ArithmeticException1 {

	public static void main(String args[])
	{
	try
	{
		int a=1/0;
		int b=20/0;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.print("you cant divide a number by zero");
		
	}

	}

}


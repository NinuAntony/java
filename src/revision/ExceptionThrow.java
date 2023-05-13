package revision;


public class ExceptionThrow {
	public static void validAge(int age)
	{
	//int age=15;
		if (age<18)
		{
			throw new ArithmeticException("not valid age");
			//System.out.println("age is not valid");
			
		}
		else
		{
			System.out.println("age is valid");
		}
	}

	public static void main(String[] args) {
		ExceptionThrow.validAge(15);
	
	}
}

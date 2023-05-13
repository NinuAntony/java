package exception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String s)
	{
		super(s);
	}
	public static void main(String[] args) throws InvalidAgeException {
	int age=15;
	if (age<18)
	{
		throw new InvalidAgeException("age not valid");
	}
	else
	{
		System.out.println("age is valid");
	}
	}

}

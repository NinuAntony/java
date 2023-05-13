package javaprograms;

public class StaticMethodOvrload {
	
	static void print()
	{
		System.out.println("hai");
	}
	static void print(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum="+sum);
		System.out.println("static method overloaded");
	}

	public static void main(String[] args) {
	StaticMethodOvrload.print();
	StaticMethodOvrload.print(10,20);

	}

}

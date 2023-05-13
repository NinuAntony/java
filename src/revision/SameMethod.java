package revision;

public class SameMethod {
	
	public void MathFunction(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition Result "+sum);
	}
	public void MathFunction(float a,float b)
	{
		float sub=a-b;
		System.out.println("subtraction Result"+sub);
	}
	public void MathFunction(double a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication Result "+mul);
	}
	public static void main(String[] args) {
		SameMethod s=new SameMethod();
		s.MathFunction(10, 20);
		
		s.MathFunction(30f, 20f);
		
		s.MathFunction(10.0, 20.0);
		

	}

}

package encapsulation;

public class User1 {

	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.setPin(1555);
		int i=b.getPin();
System.out.println(i);
if(i==1001 ||i==1234 ||i==1212)
{
	System.out.println("pin is valid");
}
else
{
	System.out.println("pin is invalid");	
}
	}

}

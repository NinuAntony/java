package revision;

public class AccountDetails
{
	public int AccDetails(String name,int number)
	{
	System.out.println("account holder name : "+name);
	System.out.println("account number : "+number);
	return number;
	}
	
	public static void main(String[] args) {
		AccountDetails acc=new AccountDetails();
		
		
		System.out.println(acc.AccDetails("NINU", 454545));
	}
}

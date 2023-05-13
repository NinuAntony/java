package javaprograms;

public class PalindromeOrNot
{
	public static void main (String args[])
	{

int i=565, sum=0, rem=0, temp=i;
while(i>0)
{
	rem=i%10;
	sum=sum*10+rem;
	i=i/10;
	
}
System.out.println(sum);
if(temp==sum)
{
	System.out.println("number is palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}

package javaprograms;

class ArmstrongOrNot
{
	public static void main (String args[])
	{

int i=153, sum=0, rem=0,temp=i;;
while(i>0)
{
	rem=i%10;
	sum=sum+rem*rem*rem;
	i=i/10;
	
}
System.out.println(temp);
if(temp==sum)
{
	System.out.println("number is armstrong");
}
else
{
	System.out.println("not armstrong");
}
}
}


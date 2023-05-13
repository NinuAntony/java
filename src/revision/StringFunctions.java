package revision;

public class StringFunctions
{
	
	public static void main (String args[]) 
	{
		
		String s="java";
		String s1="halwa";
		String s2="JAVA";
		String s3="java";
	
System.out.println(s.length());
System.out.println(s.charAt(2));
System.out.println(s.concat("programs"));
System.out.println(s.equals(s3));
System.out.println((s.equalsIgnoreCase(s2)));

System.out.println(s3.compareTo(s));
System.out.println(s1.compareTo(s));
	}

}

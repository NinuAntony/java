package revision;

public class TestEncap {

	public static void main(String[] args) {
	StudentEncap s1=new StudentEncap();
	s1.setName("ninu");
	String s=s1.getName();
	System.out.println(s);
	s1.setAge(30);
	int a=s1.getAge();	
	System.out.println(a);

	}

}

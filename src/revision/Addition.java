package revision;

public class Addition extends ChildAddition {

	
		public void display()
		{
			//ChildAddition c=new ChildAddition();
			int i=this.a;
			int j=this.b;
			    int sum=0;
			    sum=i+j;
				System.out.println("sum:" +sum);
		}
		
		public static void main(String[] args)
		{
			ChildAddition ch=new ChildAddition();
			ch.display1();
			Addition add=new Addition();
			add.display();
		}
		

	}
	



package revision;

public class ThrowsException1 {

	
		public static void validAge(int age)
		{
		//int age=15;
			if (age<18)
			{
				try {
					throw new Licence("not valid age");
				} catch (Licence e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("age is not valid");
				
			}
			else
			{
				System.out.println("age is valid");
			}
		}

		public static void main(String[] args) {
			ExceptionThrow.validAge(15);
		
		}
	}


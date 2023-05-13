package collections;

import java.util.ArrayList;

public class LargestInArray {

	public static void main(String[] args) {
		int a[] = {10, 324, 45, 90, 9808};
		ArrayList<Integer>list=new ArrayList<Integer>();
		int max = a[0];
	
		for(int i=1;i<a.length;i++)
		{
			if(max < a[i])
		       {
		          max = a[i];
		       }

		     }

		    System.out.print(max); 
		  }
		}
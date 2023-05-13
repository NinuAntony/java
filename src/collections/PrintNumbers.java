package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintNumbers {

	public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
Iterator<Integer>iter=list.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next()+" ");	
	}

	}

}

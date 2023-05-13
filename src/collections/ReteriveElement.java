package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ReteriveElement {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		int element=list.get(0);
		System.out.print("First element is"+element);
		

	}

}

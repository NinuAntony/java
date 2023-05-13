package revision;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("blue");
		list.add("violet");
		System.out.println(list);
		list.remove(3);
		System.out.println("list after removing 3rd element");
		System.out.println(list);
		boolean a=list.contains("pink");
		//System.out.println("yellow is present");
		list.add(3, "green");
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(0, "black");
		System.out.println(list);
	}

}

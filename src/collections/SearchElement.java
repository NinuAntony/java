package collections;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("blue");
		list.add("violet");
		System.out.println(list);
		if (list.contains("yellow"))
		{
			System.out.print("yellow is there");
		}
			else
			{
				System.out.print("element is not");
			}
		}

	}



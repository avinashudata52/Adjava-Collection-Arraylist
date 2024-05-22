package Linkedlist;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Pradip");
		Name.add("Sudir");
		Name.add("Pushpa");
		System.out.println(Name);
	
		Name.addFirst("Avinash");
		System.out.println(Name);
		
		Name.addLast("Onkar");
		System.out.println(Name);
		
		Name.add(2,"Anish");
		System.out.println(Name);
		
		Name.removeFirst();
		System.out.println(Name);
		
		Name.removeLast();
		System.out.println(Name);
//		
		for(String str:Name)
		{
			System.out.println(Name);
		}
		
		
		
	}

}

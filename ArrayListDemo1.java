package Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		System.out.println(list);
		
		list.add(9,110);
		System.out.println(list);
		
		list.remove(9);
		System.out.println(list);
		
		List<Integer> newlist = new ArrayList<>();
		newlist.add(150);
		newlist.add(160);
		
		System.out.println(newlist);
		
		list.addAll(newlist);
		System.out.println(list);
		
		
		System.out.println(list.get(5));

		list.remove(Integer.valueOf(150));
		System.out.println(list);


		
	}

}

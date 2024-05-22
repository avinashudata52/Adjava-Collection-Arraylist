package Linkedlist;

import java.util.ArrayDeque;

public class ArryaQueue<T> {

	public static void main(String[] args) {
		
		ArrayDeque<String> aq = new ArrayDeque<String>();
		
		aq.add("Adv");
		aq.add("gdf");
		System.out.println(aq);
		
		aq.pop();
		System.out.println(aq);
	}

}

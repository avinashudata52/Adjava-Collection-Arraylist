package Linkedlist;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack<String> st = new Stack<String>();
		st.add("Avinash");
		st.add("Akky");
		st.add("vivek");
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		   
	}

}

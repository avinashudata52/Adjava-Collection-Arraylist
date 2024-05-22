package ArrayList;
import java.util.*;
public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4);
		System.out.println(list);
		
		list.add(150);
		list.add(200);
		System.out.println(list);
		
		list.addAll(list);
		//System.out.println(list);
		
//		try
//		{
//		arrls.add("Avinash");
//		arrls.add("vinaya");
//		arrls.add("lenovo");
//		System.out.println(arrls); //display arraylist
//	
//			
//		arrls.add("HRS");
//		System.out.println(arrls);
//		
//		arrls.remove(1);
//		System.out.println(arrls); //remove index one
//		
//		arrls.add(1,"Rohit");
//		System.out.println(arrls); // display 1st index
//		
//		System.out.println(arrls.get(2)); //get only one data
//		
//		
//		arrls.clear();
//		System.out.println(arrls); //clear
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
	}

}

package arrayList;

import java.util.ArrayList;

public class Assign_15_18 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();

		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		
		System.out.println(a1.isEmpty());//returns false
		
		ArrayList<Integer>a2=new ArrayList<Integer>();

		System.out.println(a2.isEmpty());//returns true
	}
}

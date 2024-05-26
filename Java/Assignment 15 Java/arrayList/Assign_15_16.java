package arrayList;

import java.util.ArrayList;

public class Assign_15_16 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();

		a1.add(10);
		a1.add(12);
		a1.add(18);
		a1.add(19);
		
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2=(ArrayList<Integer>) a1.clone();
		System.out.println(a2);
	}
}

package arrayList;

import java.util.ArrayList;

public class Assign_15_9 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(12);
		a1.add(14);
		a1.add(16);
		
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2=(ArrayList<Integer>) a1.clone();
		System.out.println(a2);
	}
}

package arrayList;

import java.util.ArrayList;

public class Assign_15_20 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		a1.ensureCapacity(2);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
	}
}

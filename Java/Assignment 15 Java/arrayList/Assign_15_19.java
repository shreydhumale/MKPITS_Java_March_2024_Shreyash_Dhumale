package arrayList;

import java.util.ArrayList;

public class Assign_15_19 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();

		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		
		a1.trimToSize();
		System.out.println(a1);
	}
}

package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Assign_15_14 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(13);
		a1.add(17);
		a1.add(19);
		Collections.swap(a1, 0, 3);
		System.out.println(a1);
	}
}

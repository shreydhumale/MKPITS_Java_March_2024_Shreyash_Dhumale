package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class assign_15_10 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(12);
		a1.add(14);
		a1.add(16);
		Collections.shuffle(a1);
		System.out.println(a1);
	}
}

package arrayList;

import java.util.ArrayList;

public class Assign_15_4 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(21);
		a1.add(25);
		a1.add(28);
		a1.add(30);
		a1.add(2, 12);
		System.out.println("element " +a1.get(2)+" added at index 2");
		System.out.println(a1);
	}
}

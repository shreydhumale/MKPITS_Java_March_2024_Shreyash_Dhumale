package hashSet;

import java.util.HashSet;

public class Assign_15_51 {
	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.removeAll(h1);
		System.out.println(h1);
	}
}

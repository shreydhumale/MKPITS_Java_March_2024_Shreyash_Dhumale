package hashSet;

import java.util.HashSet;

public class Assign_15_57 {
	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		
		HashSet<Integer>h2=new HashSet<Integer>();
		h2.add(10);
		h2.add(60);
		h2.add(30);
		h2.add(40);
		h2.add(50);
		
		System.out.println(h1.equals(h2));
	}
}

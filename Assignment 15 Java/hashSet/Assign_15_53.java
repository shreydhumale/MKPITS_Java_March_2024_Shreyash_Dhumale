package hashSet;

import java.util.HashSet;

public class Assign_15_53 {
	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		
		HashSet<Integer>h2=new HashSet<Integer>();
		h2=(HashSet<Integer>) h1.clone();
		System.out.println(h2);
	}
}
